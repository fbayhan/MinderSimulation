package com.pandora.apiconversation.dto;

public class MatchDiceDTO {
    public Long userId;
    public Long botId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBotId() {
        return botId;
    }

    public void setBotId(Long botId) {
        this.botId = botId;
    }

    @Override
    public String toString() {
        return "MatchDiceDTO{" +
                "userId=" + userId +
                ", botId=" + botId +
                '}';
    }
}
