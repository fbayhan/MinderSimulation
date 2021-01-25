package com.pandora.apiconversation.service;

import com.pandora.apiconversation.model.ChatBots;
import com.pandora.apiconversation.model.User;
import com.pandora.apiconversation.model.UserAttibutes;

public interface DiceService {

    public int calculateSexDiceFactor(User user, ChatBots chatBot);

    public int calculateAgeDice(User user, ChatBots chatBot);

    public int calculateLookingDice(User user, ChatBots chatBot);

    public int calculateEducationDice(User user, ChatBots chatBot);

    public int calculateMoneyDice(User user, ChatBots chatBots);

    public int calculateIntellectualityDice(User user, ChatBots chatBot);

}
