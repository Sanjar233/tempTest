package com.example.testProject.service.PurveyorService;

import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.dto.purveyor.PurveyorRequest;
import com.example.testProject.dto.purveyor.PurveyorResponse;

import java.util.List;

public interface PurveyorService {

    void add_new(PurveyorRequest purveyorRequest);

    void updateById(Long purveyorId, PurveyorRequest purveyorRequest);

    List<PurveyorResponse> showAll();
}
