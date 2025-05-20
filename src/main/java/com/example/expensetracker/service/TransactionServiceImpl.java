package com.example.expensetracker.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expensetracker.model.Transaction;
import com.example.expensetracker.repo.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionRepository transactionRepo;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
		
	}

	@Override
	public List<Transaction> getAllTransactions() {
	   return transactionRepo.findAll();
		
	}

	@Override
	public Map<String, Object> getMonthlySummary(int year, int month) {
		
		LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = start.withDayOfMonth(start.lengthOfMonth());
        
        List<Transaction> monthly = transactionRepo.findAllByDateBetween(start, end);
        
        double income = 0, expense = 0;
        Map<String, Double> incomeMap = new HashMap<>();
        Map<String, Double> expenseMap = new HashMap<>();
        
        for (Transaction t : monthly) {
            if ("income".equalsIgnoreCase(t.getType())) {
                income += t.getAmount();
                incomeMap.merge(t.getCategory(), t.getAmount(), Double::sum);
            } else {
                expense += t.getAmount();
                expenseMap.merge(t.getCategory(), t.getAmount(), Double::sum);
            }
        }
        
        Map<String, Object> summary = new HashMap<>();
        summary.put("totalIncome", income);
        summary.put("totalExpense", expense);
        summary.put("netSavings", income - expense);
        summary.put("incomeBreakdown", incomeMap);
        summary.put("expenseBreakdown", expenseMap);

        return summary;
		
		
	}

}
