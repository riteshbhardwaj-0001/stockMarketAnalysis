package com.market.analysis.models;

import com.market.analysis.enums.ExchangeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="exchanges")
public class ExchangeModel extends GenericModel{

    @Enumerated(EnumType.STRING)
    private ExchangeEnum exchangeName;

    @OneToMany(mappedBy = "exchange" , orphanRemoval = true, cascade = CascadeType.ALL)
    private List<SectorModel> sectors;

    @Override
    public String toString() {
        return "Exchange{" +
                "id=" +
                getPK() +
                ", name='" + exchangeName + '\'' +
                '}';
    }
}
