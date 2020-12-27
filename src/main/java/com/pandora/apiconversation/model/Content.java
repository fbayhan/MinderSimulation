package com.pandora.apiconversation.model;

import com.pandora.apiconversation.model.enums.IntentionType;
import com.pandora.apiconversation.model.enums.MainType;

import javax.persistence.*;

@Entity
@Table(name="content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String content;


    //tanışma mı, ilerleyen tipler mi
    private MainType mainType;


    //soru mu, cevap mı, havadan sudan mı
    private IntentionType intentionType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MainType getMainType() {
        return mainType;
    }

    public void setMainType(MainType mainType) {
        this.mainType = mainType;
    }

    public IntentionType getIntentionType() {
        return intentionType;
    }

    public void setIntentionType(IntentionType intentionType) {
        this.intentionType = intentionType;
    }
}
