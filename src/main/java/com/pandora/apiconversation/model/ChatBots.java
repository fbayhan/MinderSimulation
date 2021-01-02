package com.pandora.apiconversation.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chatbots")
public class ChatBots extends  GenericClass {
    private String userName;
}
