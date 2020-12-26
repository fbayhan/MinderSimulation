package com.pandora.apiconversation.model;

import javax.persistence.*;

@Entity
@Table(name="conversation")
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private  String content;

    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Conversation{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
