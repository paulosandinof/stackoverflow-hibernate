package com.ufrn.dtos;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ufrn.entities.Answer;
import com.ufrn.entities.Question;

public class AnswerDTO {

    @JsonProperty("answer_id")
    private long answerId;

    @JsonProperty("is_accepted")
    private boolean isAccepted;

    @JsonProperty("score")
    private int score;

    @JsonProperty("body")
    private String body;

    @JsonProperty("creation_date")
    private LocalDateTime creationDate;

    @JsonProperty("last_activity_date")
    private LocalDateTime lastActivityDate;

    public Answer toAnswer(Question question) {
        return new Answer(answerId, isAccepted, score, body, question, creationDate, lastActivityDate);
    }

    public long getId() {
        return answerId;
    }

    public void setId(long answerId) {
        this.answerId = answerId;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
        return "AnswerDTO { \\n\\tanswerId: " + answerId + ", \\n\\tbody: " + body + ", \\n\\tcreationDate: "
                + creationDate + ", \\n\\tisAccepted: " + isAccepted + ", \\n\\tlastActivityDate: " + lastActivityDate
                + ", \\n\\tscore: " + score + "}";
    }
}
