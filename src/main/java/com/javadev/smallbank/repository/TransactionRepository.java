package com.javadev.smallbank.repository;

import com.javadev.smallbank.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}
/*
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
*/