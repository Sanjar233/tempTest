package com.example.testProject.mappers.PurveyorMapper.impl;

import com.example.testProject.dto.purveyor.PurveyorRequest;
import com.example.testProject.dto.purveyor.PurveyorResponse;
import com.example.testProject.entites.Purveyor;
import com.example.testProject.exception.NotFoundException;
import com.example.testProject.mappers.PurveyorMapper.PurveyorMapper;
import com.example.testProject.repositories.PurveyorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
@Component
@AllArgsConstructor
public class PurveyorMapperImpl implements PurveyorMapper {
    public final PurveyorRepository purveyorRepository;
    @Override
    public void addPurveyor(PurveyorRequest purveyorRequest){
        Purveyor purveyor = new Purveyor();
        purveyor.setName(purveyorRequest.getName());
        purveyor.setAddress(purveyorRequest.getAddress());
        purveyor.setPhone_number((purveyorRequest.getPhone_number()));
        purveyorRepository.save(purveyor);
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
    @Override
    public void updateById(Long purveyorId, PurveyorRequest purveyorRequest){
        Purveyor purveyor = purveyorRepository.findById(purveyorId).get();
        purveyor.setAddress(purveyorRequest.getAddress());
        purveyor.setPhone_number(purveyorRequest.getPhone_number());
        purveyorRepository.save(purveyor);
    }

}
