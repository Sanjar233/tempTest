package com.example.testProject.dto.transaction;

import com.example.testProject.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TransactionRequest {
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @ElementCollection
    private List<Long> commodityId = new ArrayList<>();
    @ElementCollection
    private List<Integer> amount = new ArrayList<>();
}
