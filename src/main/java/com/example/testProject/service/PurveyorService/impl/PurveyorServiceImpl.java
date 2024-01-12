package com.example.testProject.service.PurveyorService.impl;

import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.exception.BadRequestException;
import com.example.testProject.mappers.PurveyorMapper.PurveyorMapper;
import com.example.testProject.repositories.PurveyorRepository;
import com.example.testProject.service.PurveyorService.PurveyorService;

import com.example.testProject.dto.purveyor.*;
import com.example.testProject.entites.Purveyor;
//import com.example.demo.exception.NotFoundException;
//import com.example.demo.mapper.UserMapper;
//import com.example.demo.repositories.UserRepository;
//import com.example.demo.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
@Component
public class PurveyorServiceImpl implements PurveyorService {
    public final PurveyorRepository purveyorRepository;
    public final PurveyorMapper purveyorMapper;
    @Override
    public List<PurveyorResponse> showAll(){
        return purveyorMapper.getAllResponses(purveyorRepository.findAll());
    }
    @Override
    public void add_new(PurveyorRequest purveyorRequest){
        //exceptions
        purveyorMapper.addPurveyor(purveyorRequest);
    }
    @Override
    public void updateById(Long purveyorId,PurveyorRequest purveyorRequest){

    }
}
