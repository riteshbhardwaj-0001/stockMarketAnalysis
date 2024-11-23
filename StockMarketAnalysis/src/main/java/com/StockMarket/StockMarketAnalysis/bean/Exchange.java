package com.StockMarket.StockMarketAnalysis.bean;

import jakarta.persistence.*;

@Entity
@Table(name="exchange_info")
public class Exchange {

    @Id
    private Long id;
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

    public Candle getCandle() {
        return candle;
    }

    public void setCandle(Candle candle) {
        this.candle = candle;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
