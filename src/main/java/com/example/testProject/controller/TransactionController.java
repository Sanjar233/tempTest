package com.example.testProject.controller;

import com.example.testProject.dto.purveyor.PurveyorRequest;
import com.example.testProject.dto.transaction.TransactionRequest;
import com.example.testProject.dto.transaction.TransactionResponse;

import com.example.testProject.service.TransactionService.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transaction")
@RestController
@AllArgsConstructor
public class TransactionController {
    public final TransactionService transactionService;
    @PostMapping("/add_new")
    public void add_new(@RequestBody TransactionRequest transactionRequest){transactionService.add_new(transactionRequest);}
}
