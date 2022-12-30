package com.yxl.newdafuwen.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prop_card")
public class PropCard {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Column(name = "card_type", length = 32)
    private String cardType;

    @Column(name = "card_description")
    private String cardDescription;

    @Column(name = "effect")
    private byte[] effect;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    public byte[] getEffect() {
        return effect;
    }

    public void setEffect(byte[] effect) {
        this.effect = effect;
    }

}