package com.pandora.apiconversation.controller;

import com.pandora.apiconversation.dto.ChatBotDTO;
import com.pandora.apiconversation.model.ChatBots;
import com.pandora.apiconversation.service.ChatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.PostRemove;

@RestController
public class ChatBotController {
    @Autowired
    private ChatBotService chatBotService;

    @PostMapping("newchatbot")
    public ChatBots newChatBots(@RequestBody ChatBotDTO chatBotDTO) {

        System.out.println(chatBotDTO.toString());
        ChatBots chatBots = chatBotService.newChatBots(chatBotDTO);
        return chatBots;
    }
}
