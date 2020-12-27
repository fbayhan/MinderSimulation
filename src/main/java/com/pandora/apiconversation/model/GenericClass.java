package com.pandora.apiconversation.model;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
public class GenericClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column
    private Date insertDate;

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "insertDate=" + insertDate +
                '}';
    }
}
