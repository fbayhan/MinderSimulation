package com.pandora.apiconversation.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="userattributes")
public class UserAttibutes extends GenericClass {
    private int birthDate;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Sex> lookingFor=new ArrayList<Sex>();




    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }





    public List<Sex> getLookingFor() {
        return lookingFor;
    }
}
