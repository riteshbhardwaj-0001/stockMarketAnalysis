package com.market.analysis.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "generic_info")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // single_table, JOIN
public class GenericModel {

    @Id
    private Long PK;
    @CreationTimestamp
    private Timestamp createdTs;
    @UpdateTimestamp
    private Timestamp updatedTs;
}
