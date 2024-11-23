package com.StockMarket.StockMarketAnalysis.bean;

import jakarta.persistence.*;

@Entity
@Table(name="script_info")
public class Script {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="script_id", nullable = false)
    private Long id;
    @Column(name = "script_name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
