package org.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    static Account account;
    @BeforeClass
    public static void beforeClass() {
        Customer customer = new Customer("John Doe");
        Bank.createAccount(customer);
        account = Bank.retrieveAccount("John Doe");
    }

    @Test
    public void depositMoney() {
        account.depositMoney(1000);
        assertEquals(account.checkBalance(), 2000);
        account.withdrawMoney(1000);
    }

    @Test
    public void withdrawMoney() {
        account.withdrawMoney(500);
        assertEquals(account.checkBalance(), 500);
        account.depositMoney(500);
    }

    @Test
    public void checkBalance() {
        assertEquals(account.checkBalance(), 1000);
    }
}