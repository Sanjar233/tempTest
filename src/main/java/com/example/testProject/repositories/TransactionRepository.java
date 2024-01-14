package com.example.testProject.repositories;
import com.example.testProject.entites.Purveyor;
import com.example.testProject.entites.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
