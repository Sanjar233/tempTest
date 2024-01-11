package com.example.testProject.entites;

import com.example.testProject.enums.CommodityType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "commodity_table")
public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private CommodityType type;
    private int price;
    private int quantity;
//    @ManyToOne
//    Purveyor owner;
}
