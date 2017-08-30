package com.javadev.smallbank.entity;

import javax.persistence.*;

@Entity
@Table(name = "Bank_account")
public class BankAccount {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer clientId;

    private Double amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /*
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "account_id", length = 6, nullable = false)
    private int id;

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "amount")
    private double amount;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})          //
    @JoinColumn(name = "from_account_id", nullable = false)
    private Transaction transactionFrom;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})          //
    @JoinColumn(name = "to_account_id", nullable = false)
    private Transaction transactionTo;


    public BankAccount() {
    }

    public BankAccount(int clientId, double amount, Transaction transactionFrom, Transaction transactionTo) {
        this.clientId = clientId;
        this.amount = amount;
        this.transactionFrom = transactionFrom;
        this.transactionTo = transactionTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction getTransactionFrom() {
        return transactionFrom;
    }

    public void setTransactionFrom(Transaction transactionFrom) {
        this.transactionFrom = transactionFrom;
    }

    public Transaction getTransactionTo() {
        return transactionTo;
    }

    public void setTransactionTo(Transaction transactionTo) {
        this.transactionTo = transactionTo;
    }
    */
}
