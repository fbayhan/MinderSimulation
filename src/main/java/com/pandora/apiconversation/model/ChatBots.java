package com.pandora.apiconversation.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chatbots")
public class ChatBots extends GenericClass {
    private String userName;
    private String name;
    private String surName;
    private int minAge;
    private int maxAge;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sexId")
    private Sex sex;


    @ManyToMany(
            cascade = CascadeType.ALL
    )
    private List<Sex> lookingFor = new ArrayList<Sex>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ageImportanceId")
    private Importance ageImportance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lookingImportanceId")
    private Importance lookingImportance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "physicsImportanceId")
    private Importance physicsImportance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "educationImportanceId")
    private Importance educationImportance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moneyImportanceId")
    private Importance moneyImportance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intellectualityImpotanceId")
    private Importance intellectualityImpotance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Importance getAgeImportance() {
        return ageImportance;
    }

    public void setAgeImportance(Importance ageImportance) {
        this.ageImportance = ageImportance;
    }

    public Importance getLookingImportance() {
        return lookingImportance;
    }

    public void setLookingImportance(Importance lookingImportance) {
        this.lookingImportance = lookingImportance;
    }

    public Importance getPhysicsImportance() {
        return physicsImportance;
    }

    public void setPhysicsImportance(Importance physicsImportance) {
        this.physicsImportance = physicsImportance;
    }

    public Importance getEducationImportance() {
        return educationImportance;
    }

    public void setEducationImportance(Importance educationImportance) {
        this.educationImportance = educationImportance;
    }

    public Importance getMoneyImportance() {
        return moneyImportance;
    }

    public void setMoneyImportance(Importance moneyImportance) {
        this.moneyImportance = moneyImportance;
    }

    public Importance getIntellectualityImpotance() {
        return intellectualityImpotance;
    }

    public void setIntellectualityImpotance(Importance intellectualityImpotance) {
        this.intellectualityImpotance = intellectualityImpotance;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Sex> getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(List<Sex> lookingFor) {
        this.lookingFor = lookingFor;
    }

    @Override
    public String toString() {
        return "ChatBots{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", sex=" + sex +
                ", lookingFor=" + lookingFor +
                ", ageImportance=" + ageImportance +
                ", lookingImportance=" + lookingImportance +
                ", physicsImportance=" + physicsImportance +
                ", educationImportance=" + educationImportance +
                ", moneyImportance=" + moneyImportance +
                ", intellectualityImpotance=" + intellectualityImpotance +
                '}';
    }
}
