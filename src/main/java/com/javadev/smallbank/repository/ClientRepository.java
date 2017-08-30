package com.javadev.smallbank.repository;

import com.javadev.smallbank.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Integer> {
}
