package com.StockMarket.StockMarketAnalysis.bean;

import jakarta.persistence.*;

@Entity
@Table(name="exchange_info")
public class Exchange {

    @Id
    @Column(name = "exchange_id", nullable = false)
    private Long id;
    @Column(name="exchange_name",nullable = false)
    private String name;

    public Exchange(){

    }

    public Exchange(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Exchange{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
