package com.pandora.apiconversation.service;

import com.pandora.apiconversation.dto.ChatBotDTO;
import com.pandora.apiconversation.model.ChatBots;
import com.pandora.apiconversation.model.Sex;
import com.pandora.apiconversation.repository.ChatBotsRepository;
import com.pandora.apiconversation.repository.ImportanceRepository;
import com.pandora.apiconversation.repository.SexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
@Service
public class ChatBotService {
    @Autowired
    private ChatBotsRepository chatBotsRepository;

    @Autowired
    private ImportanceRepository importanceRepository;

    @Autowired
    private SexRepository sexRepository;

    public ChatBots newChatBots(ChatBotDTO chatBotDTO) {

        ChatBots chatBots = new ChatBots();
        chatBots.setAgeImportance(importanceRepository.findById(chatBotDTO.getAgeImportance()).orElse(null));
        chatBots.setEducationImportance(importanceRepository.findById(chatBotDTO.getEducationImportance()).orElse(null));
        chatBots.setIntellectualityImpotance(importanceRepository.findById(chatBotDTO.getIntellectualityImpotance()).orElse(null));
       // chatBots.setLookingFor();

        chatBots.getLookingFor().addAll((List<Sex>) sexRepository.findAllById(chatBotDTO.getLookingForSexIds()));



        chatBots.setLookingImportance(importanceRepository.findById(chatBotDTO.getLookingImportanceId()).orElse(null));
        chatBots.setMaxAge(chatBotDTO.getMaxAge());
        chatBots.setMinAge(chatBotDTO.getMinAge());
        chatBots.setName(chatBotDTO.getName());
        chatBots.setSex(sexRepository.findById(chatBotDTO.getSexId()).orElse(null));
        chatBots.setMoneyImportance(importanceRepository.findById(chatBotDTO.getMoneyImportance()).orElse(null));
        chatBots.setPhysicsImportance(importanceRepository.findById(chatBotDTO.getPhysicsImportance()).orElse(null));
        chatBots.setSurName(chatBotDTO.getSurName());
        chatBots.setUserName(chatBotDTO.getUserName());

        chatBots.setActive(true);
        chatBots.setDeleted(false);
        chatBots.setInsertTime(new Date());


        chatBotsRepository.save(chatBots);

        return chatBots;
    }

}
