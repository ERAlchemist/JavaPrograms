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
//
//        BankAccount myAccount = new BankAccount();
//        myAccount.setAccountNumber(123456789);
//        myAccount.setCustomerName("Bob Jones");
//        myAccount.setCustomerEmail("Bob.jones@gmail.com");
//        myAccount.setPhoneNumber("9092328765");
//        myAccount.setBalance(10000.23);
//        myAccount.deposit(1000.12);
//        myAccount.withdrawal(999.12);
//        myAccount.withdrawal(20000.00);
//        myAccount.getBalance();
//
//        BankAccount newAccount = new BankAccount(999999, 13.13, "bob michels", "crazyBob@gmail.com", "7609874556");
//        BankAccount otherAccount = new BankAccount ();
//
//        System.out.println(newAccount);
//        System.out.println(otherAccount);
//
//        BankAccount ericsAccount = new BankAccount("Eric", "eric@mail.com", "6165578976");

// ----------------------Challenge----------------------------------------

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields
        // Create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.




        VipCustomer newVip = new VipCustomer();
        System.out.println("newVip credit limit is " + newVip.getCreditLimit());
        System.out.println("newVip email is " + newVip.getEmailAddress());
        System.out.println("newViap name is " + newVip.getName());

        VipCustomer newVip2 = new VipCustomer("bob bobbyson", "bob.bobbyson@gmail.com");
        System.out.println("newVip2 credit limit is " + newVip2.getCreditLimit());
        System.out.println("newVip2 email is " + newVip2.getEmailAddress());
        System.out.println("newVip2 name is " + newVip2.getName());

        VipCustomer newVip3 = new VipCustomer("randy jones", "randy.jones@gmail.com", 1000d);
        System.out.println("newVip3 credit limit is " + newVip3.getCreditLimit());
        System.out.println("newVip3 email is " + newVip3.getEmailAddress());
        System.out.println("newVip3 name is " + newVip3.getName());
    }
}
