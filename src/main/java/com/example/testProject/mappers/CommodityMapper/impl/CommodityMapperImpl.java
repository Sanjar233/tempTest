package com.example.testProject.mappers.CommodityMapper.impl;
import com.example.testProject.entites.Purveyor;
import com.example.testProject.mappers.CommodityMapper.CommodityMapper;
import com.example.testProject.dto.commodity.CommodityRequest;
import com.example.testProject.dto.commodity.CommodityResponse;
import com.example.testProject.repositories.CommodityRepository;
import com.example.testProject.repositories.PurveyorRepository;
import com.example.testProject.enums.CommodityType;
import com.example.testProject.entites.Commodity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class CommodityMapperImpl implements CommodityMapper{
    private final CommodityRepository commodityRepository;
    private final PurveyorRepository purveyorRepository;

    @Override
    public CommodityResponse makeResponse(Commodity commodity) {
        CommodityResponse commodityResponse = new CommodityResponse();
        commodityResponse.setId(commodity.getId());
        commodityResponse.setName(commodity.getName());
        commodityResponse.setPrice(commodity.getPrice());
        commodityResponse.setType(CommodityType.valueOf(commodity.getType().name()));
        commodityResponse.setQuantity(commodity.getQuantity());
        return commodityResponse;
    }

    @Override
    public List<CommodityResponse> getAllResponses(List<Commodity> all) {
        List<CommodityResponse> commodityResponses = new ArrayList<>();
        for (Commodity commodity: all){
            commodityResponses.add(makeResponse(commodity));
        }
        return commodityResponses;
    }
    @Override
    public void addCommodity(CommodityRequest commodityRequest, Long purveyorId){
        Commodity commodity = new Commodity();
        commodity.setName(commodityRequest.getName());
        commodity.setType(CommodityType.valueOf(commodityRequest.getType()));
        commodity.setPrice(commodityRequest.getPrice());
        commodity.setQuantity(commodityRequest.getQuantity());
        Optional<Purveyor> purveyor =purveyorRepository.findById(purveyorId);
        List<Commodity> commodities = new ArrayList<>();
        if (purveyor.get().getPurveyorCommodities()!=null){
            commodities = purveyor.get().getPurveyorCommodities();
        }
        commodities.add(commodity);
        purveyor.get().setPurveyorCommodities(commodities);
        commodity.setOwner(purveyor.get());
        commodityRepository.save(commodity);
    }

}

