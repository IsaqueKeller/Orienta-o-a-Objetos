package com.mycompany.associacaogerenciadorsrp;

import java.util.Scanner;

public class Conta {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private static Scanner reader = new Scanner (System.in);
    
    public Conta () {
        accountNumber = "";
        accountHolder = "";
        balance = 0.0;
    }
    
    public Conta (String accountNumber , String accountHolder , double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public Conta (Conta other) {
        this.accountNumber = other.accountNumber;
        this.accountHolder = other.accountHolder;
        this.balance = other.balance;
    }
    
    public void deposit (double value) {
        if (value > 0 && this.balance >= balance) {
            this.balance -= value;
        }
    }
    
    public void withdraw (double value) {
        if (value > 0) {
            this.balance += value;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "accountNumber = " + accountNumber + ", accountHolder = " + accountHolder + ", balance = " + balance + '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
