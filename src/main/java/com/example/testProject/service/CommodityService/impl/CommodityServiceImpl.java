package com.example.testProject.service.CommodityService.impl;
//
import com.example.testProject.dto.commodity.CommodityRequest;
import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.entites.Commodity;
//import com.example.testProject.entites.User;
//import com.example.testProject.exception.BadRequestException;
//import com.example.testProject.exception.NotFoundException;
import com.example.testProject.repositories.CommodityRepository;
//import com.example.testProject.repositories.PurveyorRepository;
import com.example.testProject.service.CommodityService.CommodityService;
import com.example.testProject.mappers.CommodityMapper.CommodityMapper;
import com.example.testProject.enums.CommodityType;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
@Component
public class CommodityServiceImpl implements CommodityService {
    private final CommodityRepository commodityRepository;
//    private final CommodityMapper commodityMapper;
//    @Override
//    public List<CommodityResponse>showAll{
//        return commodityMapper.showAll(productRepository.findAll());
//    }
    @Override
    public void addCommodity(CommodityRequest commodityRequest,Long purveyor_id) {
        Commodity commodity = new Commodity();
        commodity.setName(commodityRequest.getName());
        commodity.setPrice(commodityRequest.getPrice());
        commodity.setType(CommodityType.valueOf(commodityRequest.getType()));
        commodity.setQuantity(commodityRequest.getQuantity());
        commodityRepository.save(commodity);
//        if (!containsCommodityType(commodityRequest.getType()))
//            throw new BadRequestException("no type with name: "+commodityRequest.getType()+"!");


//        Optional<Purveyor> user=userRepository.findById(userId);

//        List<Commodity> commoditys = new ArrayList<>();

//        if (user.get().getPurveyorCommoditys()!=null){
//            commoditys = user.get().getPurveyorCommoditys();
//        }
//        commoditys.add(commodity);
//        user.get().setPurveyorCommoditys(commoditys);

//        commodity.setOwner(user.get());

    }

}
