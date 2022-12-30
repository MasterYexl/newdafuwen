package com.yxl.newdafuwen.model.entity;

import com.yxl.newdafuwen.constant.EstateManagementStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "estate_management")
public class EstateManagement {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estate_id", nullable = false)
    private Estate estate;

    @Column(name = "building_number")
    private Integer buildingNumber;

    @Column(name = "sts_cd", length = 32)
    private EstateManagementStatusEnum stsCd;

    @Column(name = "create_date")
    private Instant createDate;

}