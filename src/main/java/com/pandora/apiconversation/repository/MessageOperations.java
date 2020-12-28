package com.pandora.apiconversation.repository;

import com.pandora.apiconversation.model.Message;

public interface MessageOperations {
    public boolean firstMessageDice(String username, Long chatBotId);
    public Message getMessage(String userName, Long chatBotId  );
}
