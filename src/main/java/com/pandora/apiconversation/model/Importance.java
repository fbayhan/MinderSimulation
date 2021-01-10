package com.pandora.apiconversation.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "importance")
public class Importance extends GenericClass {
    private String explain;
    private int randomEffect;

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public int getRandomEffect() {
        return randomEffect;
    }

    public void setRandomEffect(int randomEffect) {
        this.randomEffect = randomEffect;
    }

    @Override
    public String toString() {
        return "Importance{" +
                "explain='" + explain + '\'' +
                ", randomEffect=" + randomEffect +
                '}';
    }
}
