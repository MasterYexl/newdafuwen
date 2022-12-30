package com.yxl.newdafuwen.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game_map")
public class GameMap {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Column(name = "map_name")
    private Integer mapName;

    @Column(name = "map_detail")
    private byte[] mapDetail;

    @Column(name = "special_functions")
    private byte[] specialFunctions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMapName() {
        return mapName;
    }

    public void setMapName(Integer mapName) {
        this.mapName = mapName;
    }

    public byte[] getMapDetail() {
        return mapDetail;
    }

    public void setMapDetail(byte[] mapDetail) {
        this.mapDetail = mapDetail;
    }

    public byte[] getSpecialFunctions() {
        return specialFunctions;
    }

    public void setSpecialFunctions(byte[] specialFunctions) {
        this.specialFunctions = specialFunctions;
    }

}