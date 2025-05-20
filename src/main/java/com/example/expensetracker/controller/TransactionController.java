package com.example.expensetracker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.expensetracker.model.Transaction;
import com.example.expensetracker.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionService service;

	@PostMapping
public Transaction addTransaction(@RequestBody Transaction transaction) {
		return service.addTransaction(transaction);
	}
	
	@GetMapping
	public List<Transaction> getAll(){
		return service.getAllTransactions();
			
	}
	
	@GetMapping("/summary")
	public Map<String, Object> getMonthlySummary(@RequestParam int year, @RequestParam int month){
		return service.getMonthlySummary(year, month);
		
	}
	 
	

}
