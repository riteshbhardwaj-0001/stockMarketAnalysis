package com.market.analysis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "scripts")
public class ScriptModel extends GenericModel{

    private String name;

    @ManyToOne
    @JoinColumn(name= "exchange_id")
    private ExchangeModel exchange;
}
