package com.javadev.smallbank.repository;

import com.javadev.smallbank.entity.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<Client, Integer> {
}
