package com.ERAlbertus;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;

    private Lock lock;

    public BankAccount(String accountNumnber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

// synchronize....

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }


    // challenge 4
//    public void deposit(double amount) {
//        lock.lock();
//        try {
//            balance += amount;
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public void withdraw(double amount) {
//        lock.lock();
//        try {
//            balance -= amount;
//        }finally {
//            lock.unlock();
//        }
//    }

    // challenge 5
    
    public void deposit(double amount) {
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                } finally{
                    lock.unlock();
                }
            }else {
                System.out.println("Could not get the lock");
            }
        } catch(InterruptedException e) {
            // do something here
        }
    }

    public void withdraw(double amount) {
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                } finally{
                    lock.unlock();
                }
            }else {
                System.out.println("Could not get the lock");
            }
        } catch(InterruptedException e) {
            // do something here
        }
    }


}
