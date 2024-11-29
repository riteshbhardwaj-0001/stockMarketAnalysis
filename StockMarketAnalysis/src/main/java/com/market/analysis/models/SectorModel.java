package com.market.analysis.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sectors")
public class SectorModel extends GenericModel{

    private String name;
    @ManyToOne
    @JoinColumn(name="exchange_id")
    private ExchangeModel exchange;
    @OneToMany(mappedBy = "sector" , orphanRemoval = true, cascade = CascadeType.ALL)
    private List<IndustryModel>  industries;
}
