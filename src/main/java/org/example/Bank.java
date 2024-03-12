package org.example;

import java.util.ArrayList;

public class Bank {
    static ArrayList<Account> accountList = new ArrayList();
    static Account createAccount(Customer customer){
        Account acc = new Account(customer);
        accountList.add(acc);
        return acc;
    }

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
