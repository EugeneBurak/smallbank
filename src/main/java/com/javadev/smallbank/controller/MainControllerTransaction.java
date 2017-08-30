package com.javadev.smallbank.controller;

import com.javadev.smallbank.entity.Transaction;
import com.javadev.smallbank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainControllerTransaction {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TransactionRepository transactionRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewTransaction (@RequestParam Date time
            , @RequestParam Double amount) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Transaction transaction = new Transaction();
        transaction.setTime(new java.util.Date());
        transaction.setAmount(amount);
        transactionRepository.save(transaction);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Transaction> getAllUsers() {
        // This returns a JSON or XML with the users
        return transactionRepository.findAll();
    }
}
