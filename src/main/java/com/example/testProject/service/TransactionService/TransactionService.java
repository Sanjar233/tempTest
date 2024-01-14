package com.example.testProject.service.TransactionService;
import com.example.testProject.dto.transaction.TransactionRequest;
import com.example.testProject.dto.transaction.TransactionResponse;
public interface TransactionService {
    void add_new(TransactionRequest transactionRequest);
}
