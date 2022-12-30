package com.yxl.newdafuwen.model.entity;

import com.yxl.newdafuwen.constant.PlayerTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "player")
public class Player {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Column(name = "seq_number")
    private Integer seqNumber;

    @Column(name = "cash")
    private Integer cash;

    @Column(name = "game_order")
    private Integer gameOrder;

    @Column(name = "location")
    private Integer location;

    @Column(name = "create_date")
    private Instant createDate;

    @Column(name = "type", length = 32)
    private PlayerTypeEnum type;

    @Column(name = "player_password", length = 32)
    private String playerPassword;

    public String getPlayerPassword() {
        return playerPassword;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }
}