package com.pandora.apiconversation.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="educationtypes")
public class EducationTypes extends  GenericClass{
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
