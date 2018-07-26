package com.ERAlbertus;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private  String phoneNumber;

    public BankAccount () {
        this(56789, 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty Constructor called");
    }

    public BankAccount (int number, double balance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this(999999, 100.55, customerName, customerEmail, phoneNumber);
    }

    public void setAccountNumber(int number){
        this.accountNumber = number;
        System.out.println("Account number is " + this.accountNumber);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double amount){
        this.balance = amount;
        System.out.println("Balance was set to $" + this.balance);
    }

    public double getBalance () {
        return this.balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
        System.out.println("Customer name is " + this.customerName);
    }
    public String getCustomerName () {
        return this.customerName;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
        System.out.println("Customer email is " + this.customerEmail);
    }
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("Customer phone number is " + this.phoneNumber);
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit (double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + " New balance = $"+ this.getBalance());
    }

    public void withdrawal ( double amount ) {
        if(this.balance - amount < 0){
            System.out.println("Insufficient funds for requested withdrawal");

        }else{
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " New balance = $" + this.getBalance());
        }


    }
}
