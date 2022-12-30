package com.yxl.newdafuwen.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "estate")
public class Estate {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Column(name = "estate_name", nullable = false, length = 32)
    private String estateName;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "space_tolls")
    private Integer spaceTolls;

    @Column(name = "housing1_tolls")
    private Integer housing1Tolls;

    @Column(name = "housing2_tolls")
    private Integer housing2Tolls;

    @Column(name = "housing3_tolls")
    private Integer housing3Tolls;

    @Column(name = "housing4_tolls")
    private Integer housing4Tolls;

    @Column(name = "hotel_tolls")
    private Integer hotelTolls;

    @Column(name = "building_price")
    private Integer buildingPrice;

    @Column(name = "mortgage_price")
    private Integer mortgagePrice;

    @Column(name = "create_date")
    private Instant createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSpaceTolls() {
        return spaceTolls;
    }

    public void setSpaceTolls(Integer spaceTolls) {
        this.spaceTolls = spaceTolls;
    }

    public Integer getHousing1Tolls() {
        return housing1Tolls;
    }

    public void setHousing1Tolls(Integer housing1Tolls) {
        this.housing1Tolls = housing1Tolls;
    }

    public Integer getHousing2Tolls() {
        return housing2Tolls;
    }

    public void setHousing2Tolls(Integer housing2Tolls) {
        this.housing2Tolls = housing2Tolls;
    }

    public Integer getHousing3Tolls() {
        return housing3Tolls;
    }

    public void setHousing3Tolls(Integer housing3Tolls) {
        this.housing3Tolls = housing3Tolls;
    }

    public Integer getHousing4Tolls() {
        return housing4Tolls;
    }

    public void setHousing4Tolls(Integer housing4Tolls) {
        this.housing4Tolls = housing4Tolls;
    }

    public Integer getHotelTolls() {
        return hotelTolls;
    }

    public void setHotelTolls(Integer hotelTolls) {
        this.hotelTolls = hotelTolls;
    }

    public Integer getBuildingPrice() {
        return buildingPrice;
    }

    public void setBuildingPrice(Integer buildingPrice) {
        this.buildingPrice = buildingPrice;
    }

    public Integer getMortgagePrice() {
        return mortgagePrice;
    }

    public void setMortgagePrice(Integer mortgagePrice) {
        this.mortgagePrice = mortgagePrice;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

}