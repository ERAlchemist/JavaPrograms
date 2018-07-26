package com.ERAlbertus;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer () {
        this.name = "John Doe";
        this.creditLimit = 100d;
        this.emailAddress = "john.doe@bank.com";
    }

    public VipCustomer (String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = 100d;
    }

    public VipCustomer (String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
