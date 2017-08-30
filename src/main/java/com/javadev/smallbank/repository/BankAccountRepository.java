package com.javadev.smallbank.repository;

import com.javadev.smallbank.entity.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {
}
