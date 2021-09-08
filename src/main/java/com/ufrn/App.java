package com.ufrn;

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
import com.ufrn.dtos.StackOverflowApiResponseDTO;
import com.ufrn.entities.Question;
import com.ufrn.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(
                "https://api.stackexchange.com/2.3/questions?fromdate=1598918400&todate=1630454400&order=asc&sort=creation&tagged=hibernate&site=stackoverflow&filter=!b*Ar.5VD4mpdg2L*VkuIiXMYmkK*r5"))
                .build();

        try {
            HttpResponse<byte[]> response = client.send(request, BodyHandlers.ofByteArray());

            GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(response.body()));

            String jsonString = new String(gzipInputStream.readAllBytes(), StandardCharsets.UTF_8);

            ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();

            JsonNode jsonNode = mapper.readTree(jsonString);

            StackOverflowApiResponseDTO dto = mapper.readValue(jsonNode.toString(), StackOverflowApiResponseDTO.class);

            Session session = sessionFactory.openSession();

            session.beginTransaction();

            Pattern pattern = Pattern.compile("@Query|@Param");

            
            Question question = dto.getItems().get(0);
            
            Matcher matcher = pattern.matcher(question.getBody());
            
            System.out.println("Teste");
            matcher.results().forEach(result -> System.out.println(result.group()));

            // session.save(question);

            session.getTransaction().commit();
            session.close();

            sessionFactory.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
