package com.pandora.apiconversation.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="userattributes")
public class UserAttibutes extends GenericClass {
    private Date birthDate;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    private List<Sex> lookingFor=new ArrayList<Sex>();





}
