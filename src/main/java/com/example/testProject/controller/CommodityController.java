package com.example.testProject.controller;

import com.example.testProject.repositories.PurveyorRepository;
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
    private final CommodityService commodityService;
    @PostMapping("/add_new/purveyorId:{purveyorId}")
    public void add_new(@RequestBody CommodityRequest commodityRequest, @PathVariable Long purveyorId) {
        commodityService.addCommodity(commodityRequest, purveyorId);
    }
    @GetMapping("/showAll")
    List<CommodityResponse> showAll(){
        return commodityService.showAll();
    }
//    @DeleteMapping("/delete/purveyorId:{pId}/{cId}")
//    public void deleteCommodity(@PathVariable Long pId,@PathVariable Long cId){
//        commodityService.deleteById(pId,cId);}
//    }
    @GetMapping("/update/{id}")
    void updateById(@PathVariable Long id,@RequestBody CommodityRequest commodityRequest){
        commodityService.updateById(id,commodityRequest);
    }
    //change purveyor
}