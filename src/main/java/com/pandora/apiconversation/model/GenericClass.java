package com.pandora.apiconversation.model;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
public class GenericClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column
    private Date insertTime;

    @Column
    private  Date updateTime;
    @Column
    private Boolean isDeleted;

    @Column
    private Boolean isActive;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "id=" + id +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                ", isActive=" + isActive +
                '}';
    }
}
