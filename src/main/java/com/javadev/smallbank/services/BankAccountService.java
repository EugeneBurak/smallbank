package com.javadev.smallbank.services;

import com.javadev.smallbank.entity.BankAccount;

import java.util.List;

/**
 * Created by Женя on 30.08.2017.
 */
public interface BankAccountService {
    BankAccount addBankAccount(BankAccount bankAccount);
    void deleteBankAccount(int id);
    BankAccount getBankAccountById(int id);
    BankAccount editBankAccount(BankAccount bankAccount);
    List<BankAccount> getAllBankAccounts();
}
