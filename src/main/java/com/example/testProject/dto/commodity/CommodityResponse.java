package com.example.testProject.dto.commodity;
import com.example.testProject.enums.CommodityType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CommodityResponse {
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private CommodityType type;
    private int price;
    private int quantity;

}
