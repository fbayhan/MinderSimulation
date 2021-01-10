package com.pandora.apiconversation.dto;

import java.util.ArrayList;
import java.util.List;

public class ChatBotDTO {

    private String userName;
    private String name;
    private String surName;
    private Long sexId;
    private int minAge;
    private int maxAge;
    private Long lookingImportanceId;
    private Long physicsImportance;
    private Long educationImportance;
    private Long moneyImportance;
    private Long intellectualityImpotance;
    private Long ageImportance;
    private List<Long> lookingForSexIds = new ArrayList<Long>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Long getSexId() {
        return sexId;
    }

    public void setSexId(Long sexId) {
        this.sexId = sexId;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public Long getLookingImportanceId() {
        return lookingImportanceId;
    }

    public void setLookingImportanceId(Long lookingImportanceId) {
        this.lookingImportanceId = lookingImportanceId;
    }

    public Long getPhysicsImportance() {
        return physicsImportance;
    }

    public void setPhysicsImportance(Long physicsImportance) {
        this.physicsImportance = physicsImportance;
    }

    public Long getEducationImportance() {
        return educationImportance;
    }

    public void setEducationImportance(Long educationImportance) {
        this.educationImportance = educationImportance;
    }

    public Long getMoneyImportance() {
        return moneyImportance;
    }

    public void setMoneyImportance(Long moneyImportance) {
        this.moneyImportance = moneyImportance;
    }

    public Long getIntellectualityImpotance() {
        return intellectualityImpotance;
    }

    public void setIntellectualityImpotance(Long intellectualityImpotance) {
        this.intellectualityImpotance = intellectualityImpotance;
    }

    public Long getAgeImportance() {
        return ageImportance;
    }

    public void setAgeImportance(Long ageImportance) {
        this.ageImportance = ageImportance;
    }

    public List<Long> getLookingForSexIds() {
        return lookingForSexIds;
    }

    public void setLookingForSexIds(List<Long> lookingForSexIds) {
        this.lookingForSexIds = lookingForSexIds;
    }

    @Override
    public String toString() {
        return "ChatBotDTO{" +
                "userName='" + userName + '\'' +
                ", sexId=" + sexId +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", lookingImportanceId=" + lookingImportanceId +
                ", physicsImportance=" + physicsImportance +
                ", educationImportance=" + educationImportance +
                ", moneyImportance=" + moneyImportance +
                ", intellectualityImpotance=" + intellectualityImpotance +
                ", ageImportance=" + ageImportance +
                ", lookingForSexIds=" + lookingForSexIds +
                '}';
    }
}
