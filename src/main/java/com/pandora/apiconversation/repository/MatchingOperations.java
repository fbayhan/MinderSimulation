package com.pandora.apiconversation.repository;

import com.pandora.apiconversation.model.Chatbot;

public interface MatchingOperations {
    public Chatbot getRandomBot();
    public Boolean matchedDice(String userName, Long chatBotId);
    public Boolean unMatchDice(String userName, Long chatBotId);

}
