package com.yxl.newdafuwen.model.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
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
    private Integer stsCd;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "end_time")
    private Instant endTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getPlayer() {
        return player;
    }

    public void setPlayer(Integer player) {
        this.player = player;
    }

    public Integer getInitCash() {
        return initCash;
    }

    public void setInitCash(Integer initCash) {
        this.initCash = initCash;
    }

    public Integer getStsCd() {
        return stsCd;
    }

    public void setStsCd(Integer stsCd) {
        this.stsCd = stsCd;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

}