package com.ufrn.dtos;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ufrn.entities.Question;

public class QuestionDTO {

    @JsonProperty("question_id")
    private long questionId;

    @JsonProperty("tags")
    private String[] tags;

    @JsonProperty("body")
    private String body;

    @JsonProperty("answers")
    private List<AnswerDTO> answers;

    @JsonProperty("creation_date")
    private LocalDateTime creationDate;

    @JsonProperty("last_activity_date")
    private LocalDateTime lastActivityDate;

    public Question toQuestion() {
        return new Question(questionId, Arrays.toString(tags), body, creationDate, lastActivityDate);
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<AnswerDTO> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerDTO> answers) {
        this.answers = answers;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = LocalDateTime.ofEpochSecond(creationDate, 0, ZoneOffset.UTC);
    }

    public LocalDateTime getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(long lastActivityDate) {
        this.lastActivityDate = LocalDateTime.ofEpochSecond(lastActivityDate, 0, ZoneOffset.UTC);
    }

    @Override
    public String toString() {
        return "QuestionDTO { \n\tquestion_id: " + questionId + ", \n\ttags: " + Arrays.toString(tags) + ", \n\tbody: "
                + body.substring(0, 10) + "..., \n\tanswers: " + answers + ", \n\tcreation_date: " + creationDate
                + ", \n\tlast_activity_date: " + lastActivityDate + "\n}";
    }
}
