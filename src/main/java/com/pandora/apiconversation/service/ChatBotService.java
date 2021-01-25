package com.pandora.apiconversation.service;

import com.pandora.apiconversation.dto.ChatBotDTO;
import com.pandora.apiconversation.dto.MatchDiceDTO;
import com.pandora.apiconversation.model.ChatBots;
import com.pandora.apiconversation.model.Sex;
import com.pandora.apiconversation.model.User;
import com.pandora.apiconversation.model.UserAttibutes;
import com.pandora.apiconversation.repository.ChatBotsRepository;
import com.pandora.apiconversation.repository.ImportanceRepository;
import com.pandora.apiconversation.repository.SexRepository;
import com.pandora.apiconversation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Transactional
@Service
public class ChatBotService implements DiceService {
    @Autowired
    private ChatBotsRepository chatBotsRepository;

    @Autowired
    private ImportanceRepository importanceRepository;

    @Autowired
    private SexRepository sexRepository;

    @Autowired
    private UserRepository userRepository;


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

    public Boolean matchDice(MatchDiceDTO matchDiceDTO) {
        System.out.println(matchDiceDTO.toString());

        //chatBots.setAgeImportance(importanceRepository.findById(chatBotDTO.getAgeImportance()).orElse(null));
        User user = userRepository.findById(matchDiceDTO.getUserId()).orElse(null);
        ChatBots chatBot = chatBotsRepository.findById(matchDiceDTO.getBotId()).orElse(null);

        int randomFactor = 0;
        randomFactor = randomFactor+ this.calculateAgeDice(user, chatBot);
        randomFactor = randomFactor+this.calculateSexDiceFactor(user, chatBot);
        randomFactor = randomFactor+this.calculateEducationDice(user, chatBot);
        randomFactor = randomFactor+this.calculateIntellectualityDice(user, chatBot);
        randomFactor = randomFactor+this.calculateMoneyDice(user, chatBot);
        randomFactor = randomFactor+this.calculateEducationDice(user, chatBot);


        Boolean result = tossTheDice(randomFactor);

        return result;
    }

    public Boolean tossTheDice(int randomFactor) {

        Random rand = new Random();
        int diceResult = rand.ints(0, 100).findFirst().getAsInt();


        System.out.println("random = " + diceResult);
        if (diceResult < randomFactor) {
            return true;
        } else {
            return false;
        }


    }


    @Override
    public int calculateSexDiceFactor(User user, ChatBots chatBot) {
        return 10;
    }

    @Override
    public int calculateAgeDice(User user, ChatBots chatBot) {
        return 10;
    }

    @Override
    public int calculateLookingDice(User user, ChatBots chatBot) {
        return 10;
    }

    @Override
    public int calculateEducationDice(User user, ChatBots chatBot) {
        return 10;
    }

    @Override
    public int calculateMoneyDice(User user, ChatBots chatBots) {
        return 10;
    }

    @Override
    public int calculateIntellectualityDice(User user, ChatBots chatBot) {
        return 10;
    }
}
