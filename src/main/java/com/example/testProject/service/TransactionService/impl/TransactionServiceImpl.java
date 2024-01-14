package com.example.testProject.service.TransactionService.impl;


import com.example.testProject.mappers.TransactionMapper.TransactionMapper;
import com.example.testProject.repositories.TransactionRepository;
import com.example.testProject.service.TransactionService.TransactionService;
import com.example.testProject.dto.transaction.*;
import com.example.testProject.service.TransactionService.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Component
@Service
public class TransactionServiceImpl implements TransactionService {
    public final TransactionMapper transactionMapper;

    public void add_new(TransactionRequest transactionRequest){
        //
        transactionMapper.add_new(transactionRequest);
    }
}
