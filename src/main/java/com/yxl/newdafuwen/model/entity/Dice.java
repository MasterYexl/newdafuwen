package com.yxl.newdafuwen.model.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "dice")
public class Dice {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Column(name = "dice_number", nullable = false)
    private Integer diceNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Column(name = "location")
    private Integer location;

    @Column(name = "create_date")
    private Instant createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDiceNumber() {
        return diceNumber;
    }

    public void setDiceNumber(Integer diceNumber) {
        this.diceNumber = diceNumber;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

}