package com.StockMarket.StockMarketAnalysis.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name="dii_info")
public class DiiInfo {
    @Id
    @Column(name="dii_id", nullable = false)
    private Long id;
    @Column(name="dii_value", nullable = false)
    private BigDecimal value;

    @Column(name = "dii_timestamp", nullable = false, columnDefinition = "TIMESTAMP")
    private Instant timestamp;  // YYYY-MM-DD HH:MM:SS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

}
