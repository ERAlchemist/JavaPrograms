package com.example.mathfun;

public class Series {

    public static int nSum(int n){
        int sum = 0;
        int counter = 0;
        while(counter <= n){
            sum += counter;
            counter ++;
        }
        return sum;
    }

    public static int factorial(int n){
        int product = 1;
        int counter = 1;
        while(counter <= n){
            product *= counter;
            counter ++;
        }
        return product;
    }

    public static int fibonacci( int n) {
        int counter = 0;
        int next = 1;
        int prev = 0;
        int fib = 1;
        while(counter <= n-2){
            fib = next + prev;
            counter ++;
            prev = next;
            next = fib;
        }
        return fib;
    }
}
