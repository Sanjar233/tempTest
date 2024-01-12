package com.example.testProject.mappers.PurveyorMapper.impl;

import com.example.testProject.dto.purveyor.PurveyorRequest;
import com.example.testProject.dto.purveyor.PurveyorResponse;
import com.example.testProject.entites.Purveyor;
import com.example.testProject.mappers.PurveyorMapper.PurveyorMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
@Component
@AllArgsConstructor
public class PurveyorMapperImpl implements PurveyorMapper {
    @Override
    public void addPurveyor(PurveyorRequest purveyorRequest){
        Purveyor purveyor = new Purveyor();
        purveyor.setName(purveyorRequest.getName());
        purveyor.setAddress(purveyorRequest.getAddress());
        purveyor.setPhone_number((purveyorRequest.getPhone_number()));
    }
    @Override
    public PurveyorResponse makeResponse(Purveyor purveyor) {
        PurveyorResponse purveyorResponse = new PurveyorResponse();
        purveyorResponse.setId(purveyor.getId());
        purveyorResponse.setName(purveyor.getName());
        purveyorResponse.setAddress(purveyor.getAddress());
        purveyorResponse.setPhone_number(purveyor.getPhone_number());
        return purveyorResponse;
    }
    @Override
    public List<PurveyorResponse> getAllResponses(List<Purveyor> all) {
        List<PurveyorResponse> purveyorResponses = new ArrayList<>();
        for (Purveyor purveyor: all){
            purveyorResponses.add(makeResponse(purveyor));
        }
        return purveyorResponses;
    }
}
