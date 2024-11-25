package com.market.analysis.models;

import com.market.analysis.enums.ExchangeEnum;
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
@Table(name="exchange_info")
public class ExchangeModel {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private ExchangeEnum exchangeName;

    @Override
    public String toString() {
        return "Exchange{" +
                "id=" + id +
                ", name='" + exchangeName + '\'' +
                '}';
    }
}
