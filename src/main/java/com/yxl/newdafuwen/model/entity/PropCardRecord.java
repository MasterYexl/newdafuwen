package com.yxl.newdafuwen.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "prop_card_record")
public class PropCardRecord {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Column(name = "player_id", nullable = false, length = 32)
    private String playerId;

    @Column(name = "create_time")
    private Instant createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

}