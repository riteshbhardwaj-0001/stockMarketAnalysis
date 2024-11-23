package com.StockMarket.StockMarketAnalysis.bean;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name="candle_info")
public class Candle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "candle_id", nullable = false)
    private Long id;
    @Column(name = "open_price" , nullable = false , precision = 6, scale = 2)
    private BigDecimal openPrice;
    @Column(name = "close_price" , nullable = false , precision = 6, scale = 2)
    private BigDecimal closePrice;
    @Column(name = "low_price" , nullable = false , precision = 6, scale = 2)
    private BigDecimal lowPrice;
    @Column(name = "high_price" , nullable = false , precision = 6, scale = 2)
    private BigDecimal highPrice;
    @Column(name = "candle_timestamp", nullable = false, columnDefinition = "TIMESTAMP")
    private Instant timeStamp;   // YYYY-MM-DD HH:MM:SS
    @OneToOne
    @JoinColumn(name = "exchange_Id")
    private Exchange exchange;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    public BigDecimal getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(BigDecimal lowPrice) {
        this.lowPrice = lowPrice;
    }

    public BigDecimal getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(BigDecimal highPrice) {
        this.highPrice = highPrice;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }
}
