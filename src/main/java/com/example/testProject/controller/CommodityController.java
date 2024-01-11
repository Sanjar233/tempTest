package com.example.testProject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.testProject.dto.commodity.*;

//
import com.example.testProject.entites.Commodity;
//import com.example.testProject.entites.Purveyor;
import com.example.testProject.mappers.CommodityMapper.CommodityMapper;
import org.springframework.web.bind.annotation.RequestMapping;
//import com.example.testProject.repositories.PurveyorRepository;
import com.example.testProject.repositories.CommodityRepository;
import com.example.testProject.service.CommodityService.CommodityService;
import java.util.Optional;
import java.util.List;
//

@RestController
@RequestMapping("/commodity")
@AllArgsConstructor
public class CommodityController {
    private final CommodityRepository commodityRepository;
    private final CommodityService commodityService;
//    private final CommodityMapper commodityMapper;
//    private final PurveyorRepository purveyorRepository;
    @PostMapping("/add_new/{purveyor_id}")
    public void add_new(@RequestBody CommodityRequest commodityRequest, @PathVariable Long purveyor_id) {
        commodityService.addCommodity(commodityRequest, purveyor_id);
    }
    @GetMapping("/allCommodity")
    List<Commodity> products(){
        return commodityRepository.findAll();
    }
}