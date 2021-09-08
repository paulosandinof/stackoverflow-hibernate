package com.ufrn.entities;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    private long id;

    private String tags;

    @Column(columnDefinition = "TEXT")
    private String body;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private List<Answer> answers;

    private LocalDateTime creationDate;

    private LocalDateTime lastActivityDate;

    public Question() {

    }

    @JsonCreator
    public Question(@JsonProperty("question_id") long id, @JsonProperty("tags") String[] tags,
            @JsonProperty("body") String body, @JsonProperty("answers") List<Answer> answers,
            @JsonProperty("creation_date") long creationDate,
            @JsonProperty("last_activity_date") long lastActivityDate) {
        this.id = id;
        this.tags = Arrays.toString(tags);
        this.body = body;
        this.answers = answers;
        this.creationDate = LocalDateTime.ofEpochSecond(creationDate, 0, ZoneOffset.UTC);
        this.lastActivityDate = LocalDateTime.ofEpochSecond(lastActivityDate, 0, ZoneOffset.UTC);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
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
        return "Question [answers=" + answers + ", body=" + body + ", creationDate=" + creationDate + ", id=" + id
                + ", lastActivityDate=" + lastActivityDate + ", tags=" + tags + "]";
    }
}
