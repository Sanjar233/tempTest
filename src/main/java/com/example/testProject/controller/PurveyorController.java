package com.example.testProject.controller;

import com.example.testProject.repositories.CommodityRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.dto.purveyor.PurveyorRequest;
import com.example.testProject.dto.purveyor.PurveyorResponse;
import com.example.testProject.entites.Purveyor;
import com.example.testProject.mappers.CommodityMapper.CommodityMapper;
import com.example.testProject.repositories.PurveyorRepository;
import com.example.testProject.service.PurveyorService.PurveyorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//
@RequestMapping("/purveyor")
@RestController
@AllArgsConstructor
public class PurveyorController {
    private  final CommodityRepository commodityRepository;
    private final PurveyorRepository purveyorRepository;
    private final PurveyorService purveyorService;
    private final CommodityMapper commodityMapper;
    @GetMapping("/showAllPurveyors")
    List<PurveyorResponse> showAll(){
        return purveyorService.showAll();
    }
    @PostMapping("/add_new")
    public void add_new(@RequestBody PurveyorRequest purveyorRequest){purveyorService.add_new(purveyorRequest);}
    //delete
    //update
    @PutMapping("/update_info/for_purveyor_id:{purveyorId}")
    public void updatePurveyor(@PathVariable Long purveyorId,@RequestBody PurveyorRequest purveyorRequest){
        purveyorService.updateById(purveyorId,purveyorRequest);}
}

