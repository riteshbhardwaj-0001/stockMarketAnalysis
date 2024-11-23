package com.StockMarket.StockMarketAnalysis.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {

    @Id
    @Column( name="product_id", nullable = false)
    private Long id;
    @Column(name= "product_name",nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
