package com.yxl.newdafuwen.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "prop_card_record")
public class PropCardRecord {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "prop_card_id", nullable = false)
    private PropCardRecord propCard;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Column(name = "create_time")
    private Instant createTime;

}