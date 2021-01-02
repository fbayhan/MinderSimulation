package com.pandora.apiconversation.controller;

import com.pandora.apiconversation.dto.ChatbotConversationDTO;
import com.pandora.apiconversation.dto.LayRightKeftDTO;
import com.pandora.apiconversation.model.Chatbot;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    public String layRightLeft(LayRightKeftDTO layRightKeftDTO) {
        return "Lay right left dto worked";
    }

    public String isThereAnyOneLikedMe() {
        return "is there anyone liked me worked";
    }

    public  String getConversations(Long userID){
    return     "get conversations worked";
    }
    public  String getSpecificConversation(Long userId, Long chatBotId){
        return  "get specific conversation worked";
    }

    public String getConversationOptions(Long lastConversationId){
        return  "get conversation options worked";
    }
    public String getBotMessage(Long lastConversationId){
        return "get get bot message worked";

    }
    public  String  sendUserConversation(Long conversationId){
        return "send user conversation worked";
    }
    public String  getChatBotConversation(ChatbotConversationDTO chatbotConversation){
        return "get chatbot conversation worked";
    }

}
