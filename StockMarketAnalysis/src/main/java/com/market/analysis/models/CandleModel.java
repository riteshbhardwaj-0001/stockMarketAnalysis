package com.market.analysis.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="candles")
public class CandleModel extends GenericModel{

    @Column(name = "open_price" , nullable = false , columnDefinition = "DOUBLE")
    private Double openPrice;
    @Column(name = "close_price" , nullable = false , columnDefinition = "DOUBLE")
    private Double closePrice;
    @Column(name = "low_price" , nullable = false , columnDefinition = "DOUBLE")
    private Double lowPrice;
    @Column(name = "high_price" , nullable = false , columnDefinition = "DOUBLE")
    private Double highPrice;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "exchange_Id")
    private ExchangeModel exchangeModel;


    /**
     * CascadeType :
     *   1. PERSIST : if parent is saved, all its children will be saved automatically in a single DB transaction
     *   2. MERGE : if parent entity is merged, children are automatically merged
     *   3. REMOVE : if parent table is deleted, all child entities will be removed
     *   4. REFRESH :if parent table is refreshed, child entities are also refreshed
     *   5. DETACH : if parent table is detached from any context, child entities are also detached
     *   6. ALL : provides feature of all above values
     *
     *   orphan_removal : if child is removed from children list, it will automatically be deleted from database
     */
}
