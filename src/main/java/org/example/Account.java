package org.example;

public class Account {
    Customer customer;
    int balance = 0;

    Account(Customer customer){
        this.customer = customer;
        depositMoney(customer.initialDeposit);
    }

    void depositMoney(int deposit){
        balance += deposit;
    }

    void withdrawMoney(int withdraw){
        balance -= withdraw;
    }

    int checkBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account Owner: " + customer.name + "\nBalance: " + balance;
    }
}
