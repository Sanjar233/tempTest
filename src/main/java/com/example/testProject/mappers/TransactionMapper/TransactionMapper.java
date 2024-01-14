package com.example.testProject.mappers.TransactionMapper;
import com.example.testProject.entites.Transaction;
import com.example.testProject.dto.transaction.TransactionRequest;
import com.example.testProject.dto.transaction.TransactionResponse;
public interface TransactionMapper {
    void add_new(TransactionRequest transactionRequest);
}
