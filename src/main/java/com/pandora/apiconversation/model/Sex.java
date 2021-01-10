package com.pandora.apiconversation.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sex")
public class Sex extends GenericClass {


    private String sexName;

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }
}
