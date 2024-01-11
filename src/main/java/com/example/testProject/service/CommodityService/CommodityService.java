package com.example.testProject.service.CommodityService;
import com.example.testProject.dto.commodity.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CommodityService {
    void addCommodity(CommodityRequest commodityRequest, Long purveyor_id);
    List<CommodityResponse> showAll ();
}
