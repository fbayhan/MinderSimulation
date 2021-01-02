package com.pandora.apiconversation.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User extends GenericClass {



    private String userName;
    private  String eMail;
    private String passWord;
    private String name;
    private String surName;

    @OneToOne
    private UserAttibutes userAttibutes;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public UserAttibutes getUserAttibutes() {
        return userAttibutes;
    }

    public void setUserAttibutes(UserAttibutes userAttibutes) {
        this.userAttibutes = userAttibutes;
    }
}
