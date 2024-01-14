package com.example.testProject.entites;

import com.example.testProject.enums.CommodityType;
import com.example.testProject.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "transaction_table")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @ElementCollection
    private List<Long> commodityId = new ArrayList<>();
    @ElementCollection
    private List<Integer> amount = new ArrayList<>();

}
