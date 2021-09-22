package com.ufrn.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    private long id;

    @Column
    private String tags;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column
    private LocalDateTime creationDate;

    @Column
    private LocalDateTime lastActivityDate;

    public Question() {

    }

    public Question(long id, String tags, String body, LocalDateTime creationDate, LocalDateTime lastActivityDate) {
        this.id = id;
        this.tags = tags;
        this.body = body;
        this.creationDate = creationDate;
        this.lastActivityDate = lastActivityDate;
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
        return "Question { \\n\\tbody: " + body + ", \\n\\tcreationDate: " + creationDate + ", \\n\\tid: " + id
                + ", \\n\\tlastActivityDate: " + lastActivityDate + ", \\n\\ttags: " + tags + "}";
    }
}
