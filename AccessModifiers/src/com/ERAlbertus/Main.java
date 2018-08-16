package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
        Account ericsAccount = new Account("eric");
        ericsAccount.deposit(1000);
        ericsAccount.withdraw(500);
        ericsAccount.withdraw(-200);
        ericsAccount.deposit(-20);
        ericsAccount.calculateBalance();
        ericsAccount.balance = 5000;

        System.out.println("Balance on account is " + ericsAccount.getBalance());
        ericsAccount.transactions.add(4500);
        ericsAccount.calculateBalance();
    }
}
