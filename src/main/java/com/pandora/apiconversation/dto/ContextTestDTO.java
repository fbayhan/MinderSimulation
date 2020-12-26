package com.pandora.apiconversation.dto;

public class ContextTestDTO {
    private String context;
    private String type;


    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ContextTestDTO{" +
                "context='" + context + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
