package com.yxl.newdafuwen.model.entity;

import com.yxl.newdafuwen.constant.GameStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "game")
public class Game {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_map_id", nullable = false)
    private GameMap gameMap;

    @Column(name = "game_name", length = 32)
    private String gameName;

    @Column(name = "player")
    private Integer player;

    @Column(name = "init_cash", nullable = false)
    private Integer initCash;

    @Column(name = "sts_cd")
    private GameStatusEnum stsCd;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "end_time")
    private Instant endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "winner")
    private Player winner;

    @Column(name = "game_password", length = 32)
    private String gamePassword;

    @Column(name = "max_dice_number", nullable = false)
    private Integer maxDiceNumber;

    @Column(name = "current_order", nullable = false)
    private Integer currentOrder;

    public Integer getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Integer currentOrder) {
        this.currentOrder = currentOrder;
    }

    public Integer getMaxDiceNumber() {
        return maxDiceNumber;
    }

    public void setMaxDiceNumber(Integer maxDiceNumber) {
        this.maxDiceNumber = maxDiceNumber;
    }

    public String getGamePassword() {
        return gamePassword;
    }

    public void setGamePassword(String gamePassword) {
        this.gamePassword = gamePassword;
    }
}