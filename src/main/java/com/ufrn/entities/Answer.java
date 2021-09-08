package com.ufrn.entities;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    private long id;

    private boolean isAccepted;

    private int score;

    @Column(columnDefinition = "TEXT")
    private String body;

    private LocalDateTime creationDate;

    private LocalDateTime lastActivityDate;

    public Answer() {

    }

    @JsonCreator
    public Answer(@JsonProperty("answer_id") long id, @JsonProperty("is_accepted") boolean isAccepted,
            @JsonProperty("score") int score, @JsonProperty("body") String body,
            @JsonProperty("creation_date") long creationDate,
            @JsonProperty("last_activity_date") long lastActivityDate) {
        this.id = id;
        this.isAccepted = isAccepted;
        this.score = score;
        this.body = body;
        this.creationDate = LocalDateTime.ofEpochSecond(creationDate, 0, ZoneOffset.UTC);
        this.lastActivityDate = LocalDateTime.ofEpochSecond(lastActivityDate, 0, ZoneOffset.UTC);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(LocalDateTime lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    @Override
    public String toString() {
        return "Answer [body=" + body + ", creationDate=" + creationDate + ", id=" + id + ", isAccepted=" + isAccepted
                + ", lastActivityDate=" + lastActivityDate + ", score=" + score + "]";
    }
}
