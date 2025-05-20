package com.example.expensetracker.service;

import java.util.List;
import java.util.Map;

import com.example.expensetracker.model.Transaction;

public interface TransactionService {
	
	Transaction addTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
    Map<String, Object> getMonthlySummary(int year, int month);

}
