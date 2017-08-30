package com.javadev.smallbank.services.impl;

import com.javadev.smallbank.entity.Transaction;
import com.javadev.smallbank.repository.TransactionRepository;
import com.javadev.smallbank.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction addTransaction(Transaction transaction) {
        Transaction savedTransaction = transactionRepository.save(transaction);
        return savedTransaction;
    }

    @Override
    public void deleteTransaction(int id) {
        transactionRepository.delete(id);
    }

    @Override
    public Transaction getTransactionById(int id) {
        return transactionRepository.findOne(id);
    }

    @Override
    public Transaction getTransactionByTime(Date time) {
        return /*transactionRepository. */ null;
    }

    @Override
    public Transaction editTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return /*transactionRepository. */ null;
    }

}
