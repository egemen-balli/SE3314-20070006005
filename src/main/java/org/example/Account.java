package org.example;

/**
 * The Account class represents an Account.
 */
public class Account {
    /** Account's owner. */
    Customer customer;
    /** Balance in the account. */
    int balance = 0;

    Account(Customer customer){
        this.customer = customer;
        depositMoney(customer.initialDeposit);
    }

    /**
     * Deposits money to account.
     *
     * @param deposit the amount you want to deposit
     */
    void depositMoney(int deposit){
        balance += deposit;
    }

    /**
     * Withdraws money from account.
     *
     * @param withdraw the amount you want to withdraw
     */
    void withdrawMoney(int withdraw){
        balance -= withdraw;
    }

    /**
     * Returns the balance in the account.
     *
     * @return The balance in the account.
     */
    int checkBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account Owner: " + customer.name + "\nBalance: " + balance;
    }
}
