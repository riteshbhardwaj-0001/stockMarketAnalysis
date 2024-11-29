package com.market.analysis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "scripts")
public class ScriptModel extends GenericModel{

    private String name;

    @ManyToOne
    @JoinColumn(name= "industry_id")
    private IndustryModel industry;
    @OneToMany(mappedBy = "script" , orphanRemoval = true , cascade = CascadeType.ALL)
    private List<CandleModel> candles;


}
