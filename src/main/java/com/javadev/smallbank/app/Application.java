package com.javadev.smallbank.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.javadev.smallbank.controller")
@EnableJpaRepositories(basePackages = {"com.javadev.smallbank.repository"})
@PropertySource("classpath:application.properties")
@EntityScan(basePackages = "com.javadev.smallbank.entity")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


