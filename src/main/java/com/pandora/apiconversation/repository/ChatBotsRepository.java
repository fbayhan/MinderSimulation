package com.pandora.apiconversation.repository;

import com.pandora.apiconversation.model.ChatBots;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatBotsRepository extends CrudRepository<ChatBots, Long> {
}
