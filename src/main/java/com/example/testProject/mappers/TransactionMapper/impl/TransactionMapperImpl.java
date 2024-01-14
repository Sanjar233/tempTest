package com.example.testProject.mappers.TransactionMapper.impl;
import com.example.testProject.dto.transaction.TransactionRequest;
import com.example.testProject.entites.Commodity;
import com.example.testProject.entites.Transaction;
import com.example.testProject.mappers.CommodityMapper.CommodityMapper;
import com.example.testProject.mappers.TransactionMapper.TransactionMapper;
import com.example.testProject.repositories.CommodityRepository;
import com.example.testProject.repositories.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
@AllArgsConstructor
public class TransactionMapperImpl implements TransactionMapper{
    public final TransactionRepository transactionRepository;
    public final CommodityRepository commodityRepository;
    public final CommodityMapper commodityMapper;
    public void add_new(TransactionRequest transactionRequest){
        Transaction transaction = new Transaction();
        transaction.setDate(LocalDateTime.now());
        transaction.setType(transactionRequest.getType());
        transaction.setCommodityId((transactionRequest.getCommodityId()));
        transaction.setAmount(transactionRequest.getAmount());
        for(int i = 0; i < transactionRequest.getCommodityId().size();i++){
            Long curId = transactionRequest.getCommodityId().get(i);
            int curChange = transactionRequest.getAmount().get(i);
            commodityMapper.updateQuantity(curId,curChange);
        }
        transactionRepository.save(transaction);
    }
}
