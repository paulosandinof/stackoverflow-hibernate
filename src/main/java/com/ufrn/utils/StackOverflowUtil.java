package com.ufrn.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ufrn.dtos.PageDTO;
import com.ufrn.dtos.QuestionDTO;
import com.ufrn.entities.Question;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StackOverflowUtil {

    SessionFactory sessionFactory;

    public StackOverflowUtil(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public PageDTO sendHttpRequest(int page) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://api.stackexchange.com/2.3/questions?" + "fromdate=1598918400&"
                        + "todate=1630454400&" + "page=" + page + "&" + "pagesize=100&" + "order=asc&"
                        + "sort=creation&" + "tagged=hibernate&" + "site=stackoverflow&"
                        + "filter=!b*Ar.5VD4mpdg2L*VkuIiXMYmkK*r5"))
                .build();

        HttpResponse<byte[]> response = client.send(request, BodyHandlers.ofByteArray());

        GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(response.body()));

        String jsonString = new String(gzipInputStream.readAllBytes(), StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        JsonNode jsonNode = mapper.readTree(jsonString);

        return mapper.readValue(jsonNode.toString(), PageDTO.class);
    }

    public void process(PageDTO page) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        // Iterate through all pages
        for (QuestionDTO item : page.getItems()) {

            // Check question body for annotations
            Pattern pattern = Pattern.compile(Annotations.HIBERNATE_ANNOTATIONS + "|" + Annotations.JPA_ANNOTATIONS);

            Matcher matcher = pattern.matcher(item.getBody());

            // If there's an annotation on the question
            if (matcher.find()) {
                // Convert questionDTO to Question entity
                Question question = item.toQuestion();

                // Save Question entity
                session.save(question);

                // If QuestionDTO has answers, convert them to entities and save them
                if (item.getAnswers() != null) {
                    item.getAnswers().stream().map(answer -> answer.toAnswer(question)).forEach(session::save);
                }
            }
        }

        session.getTransaction().commit();

        session.close();
    }
}
