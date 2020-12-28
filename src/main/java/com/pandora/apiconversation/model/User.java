package com.pandora.apiconversation.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User extends GenericClass {



    private String userName;
    private  String eMail;
    private String passWord;



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

    @Override
    public String toString() {
        return "User{" +
                ", userName='" + userName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
