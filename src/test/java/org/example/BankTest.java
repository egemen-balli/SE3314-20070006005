package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void createAccount() {
        Customer customer = new Customer("John Doe");
        Account acc1 = Bank.createAccount(customer);
        Account acc2 = new Account(customer);
        assertEquals(acc1.balance, acc2.balance);
        assertEquals(acc1.customer, acc2.customer);

    }

    @Test
    public void retrieveAccount() {
        Customer customer = new Customer("John Doe");
        Account acc = Bank.createAccount(customer);
        assertSame(Bank.retrieveAccount("John Doe"), acc);
    }
}