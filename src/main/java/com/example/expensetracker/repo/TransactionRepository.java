package com.example.expensetracker.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expensetracker.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	List<Transaction> findAllByDateBetween(LocalDate start, LocalDate end);

}
