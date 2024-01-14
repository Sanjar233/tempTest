package com.example.testProject.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.testProject.dto.purveyor.PurveyorRequest;
import com.example.testProject.dto.purveyor.PurveyorResponse;
import com.example.testProject.service.PurveyorService.PurveyorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/purveyor")
@RestController
@AllArgsConstructor
public class PurveyorController {
    private final PurveyorService purveyorService;
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
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        purveyorService.deleteById(id);
    }
}

