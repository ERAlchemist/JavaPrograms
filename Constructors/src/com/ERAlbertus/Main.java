package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
	    // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds ( this should increment the balance).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(123456789);
        myAccount.setCustomerName("Bob Jones");
        myAccount.setCustomerEmail("Bob.jones@gmail.com");
        myAccount.setPhoneNumber("9092328765");
        myAccount.setBalance(10000.23);
        myAccount.deposit(1000.12);
        myAccount.withdrawal(999.12);
        myAccount.withdrawal(20000.00);
        myAccount.getBalance();

        BankAccount newAccount = new BankAccount(999999, 13.13, "bob michels", "crazyBob@gmail.com", "7609874556");
        BankAccount otherAccount = new BankAccount ();

        System.out.println(newAccount);
        System.out.println(otherAccount);
    }
}
