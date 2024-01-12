package com.example.testProject.mappers.CommodityMapper;

import com.example.testProject.dto.commodity.CommodityRequest;
import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.entites.Commodity;
import com.example.testProject.repositories.CommodityRepository;

import java.util.List;

public interface CommodityMapper {
    CommodityResponse makeResponse(Commodity commodity);
    List<CommodityResponse> getAllResponses(List<Commodity> all);

    void addCommodity(CommodityRequest commodityRequest, Long purveyorId);
}
