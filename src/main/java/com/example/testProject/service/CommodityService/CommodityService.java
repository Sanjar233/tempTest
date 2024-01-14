package com.example.testProject.service.CommodityService;
import com.example.testProject.dto.commodity.*;
import com.example.testProject.entites.Commodity;

import java.util.List;

public interface CommodityService {
    void addCommodity(CommodityRequest commodityRequest, Long purveyorId);

    List<CommodityResponse> showAll();

    void updateById(Long id, CommodityRequest commodityRequest);


//    void deleteById(Long pId,Long cId);
}
