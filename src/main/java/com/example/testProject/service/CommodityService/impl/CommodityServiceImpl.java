package com.example.testProject.service.CommodityService.impl;
//
import com.example.testProject.dto.commodity.CommodityRequest;
import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.entites.Commodity;
import com.example.testProject.entites.Purveyor;
import com.example.testProject.exception.BadRequestException;
//import com.example.testProject.exception.NotFoundException;
import com.example.testProject.mappers.CommodityMapper.CommodityMapper;
import com.example.testProject.repositories.CommodityRepository;
import com.example.testProject.repositories.PurveyorRepository;
import com.example.testProject.service.CommodityService.CommodityService;
//import com.example.testProject.mappers.CommodityMapper.CommodityMapper;
import com.example.testProject.enums.CommodityType;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

//
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
@Component
public class CommodityServiceImpl implements CommodityService {
    private final CommodityMapper commodityMapper;
    private final CommodityRepository commodityRepository;
    private final PurveyorRepository purveyorRepository;
    public boolean containsType(String s){
        for (CommodityType type: CommodityType.values()){
            if (type.name().equalsIgnoreCase(s)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void addCommodity(CommodityRequest commodityRequest,Long purveyorId) {
        Optional<Purveyor> purveyor =purveyorRepository.findById(purveyorId);
        if(purveyor.isEmpty())
            throw new BadRequestException("purveyor with id: "+purveyorId );
        if (!containsType(commodityRequest.getType()))
            throw new BadRequestException("no type with name: "+commodityRequest.getType()+"!");

        commodityMapper.addCommodity(commodityRequest,purveyorId);

    }
    @Override
    public List<CommodityResponse> showAll(){
        return commodityMapper.getAllResponses(commodityRepository.findAll());
    }
    @Override
    public void deleteById(Long cId){
        Optional<Commodity> commodity = commodityRepository.findById(cId);
        if (commodity.isEmpty()){
            throw new NotFoundException("Sent not existing id");
        }

        commodityRepository.deleteById(cId);
    }


}
