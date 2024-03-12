package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void createAccount() {
        Customer customer = new Customer("John Doe");
        //assertSame(Bank.createAccount(customer), );
    }

    @Test
    public void retrieveAccount() {
        Customer customer = new Customer("John Doe");
        Account acc = Bank.createAccount(customer);
        assertSame(Bank.retrieveAccount("John Doe"), acc);
    }
}