package com.example.testProject.mappers.PurveyorMapper;

import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.dto.purveyor.PurveyorRequest;
import com.example.testProject.dto.purveyor.PurveyorResponse;
import com.example.testProject.entites.Commodity;
import com.example.testProject.entites.Purveyor;

import java.util.List;

public interface PurveyorMapper {
    void addPurveyor(PurveyorRequest purveyorRequest);
    PurveyorResponse makeResponse(Purveyor purveyor);
    List<PurveyorResponse> getAllResponses(List<Purveyor> all);
    void updateById(Long purveyorId, PurveyorRequest purveyorRequest);
}
