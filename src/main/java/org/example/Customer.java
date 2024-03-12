package org.example;

/**
 * The Customer class represents a Customer.
 */
public class Customer {
    /** Customer's name. */
    String name;
    /** Initial Deposit when creating account. */
    int initialDeposit;

    Customer(String name){
        this.name = name;
        initialDeposit = 1000;
    }
}
