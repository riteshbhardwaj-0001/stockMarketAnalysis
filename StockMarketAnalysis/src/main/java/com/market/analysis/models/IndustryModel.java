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
@Table(name = "industries")
public class IndustryModel extends GenericModel{

    private String name;
    @ManyToOne
    @JoinColumn(name = "sector_id")
    private SectorModel sector;
    @OneToMany(mappedBy = "industry", orphanRemoval = true , cascade = CascadeType.ALL)
    private List<ScriptModel> scripts;
}
