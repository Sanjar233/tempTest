package com.example.testProject.entites;
import com.example.testProject.enums.CommodityType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "purveyors_table")
public class Purveyor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phone_number;
    @OneToMany(cascade = CascadeType.ALL)
    List<Commodity>purveyorCommodities;


}