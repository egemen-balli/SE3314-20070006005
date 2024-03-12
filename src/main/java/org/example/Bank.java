package org.example;

import java.util.ArrayList;

/**
 * The Bank class represents a Bank.
 */
public class Bank {
    /** The list of the accounts. */
    static ArrayList<Account> accountList = new ArrayList();

    /**
     * Creates an account.
     * @param customer Customer information for the account.
     * @return
     */
    static Account createAccount(Customer customer){
        Account acc = new Account(customer);
        accountList.add(acc);
        return acc;
    }

    /**
     * Retrieves an existing account from the Bank.
     * @param customerName Customer name as a String.
     * @return The Customer as an Object.
     */
    static Account retrieveAccount(String customerName){
        for (Account a : accountList) {
            if(a.customer.name == customerName){
                return a;
            }
            else {
                System.out.println("Account does not exist.");
            }
        }
        return null;
    }
}
