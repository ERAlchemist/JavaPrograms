package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
        System.out.println(isPalindrome(222));
        System.out.println(isPalindrome(386));
        System.out.println("**************");
        System.out.println(sumFirstAndLastDigit(1234));
        System.out.println(sumFirstAndLastDigit(19));
        System.out.println(sumFirstAndLastDigit(609877679));
        System.out.println("**************");
        System.out.println(getEvenDigitSum(135649));
    }

    public static boolean isPalindrome(int number) {

        int normal = Math.abs(number);
        int reversed = 0;

        while(normal > 0){
            int digit = normal%10;
            reversed += digit;
            normal /= 10;
            reversed *= 10;
        }
        reversed = reversed/10;
        return (Math.abs(number) == reversed);
    }

    public static int sumFirstAndLastDigit (int number) {
        if(number < 0)
            return -1;
        int firstDigit = 0;
        int lastDigit = number % 10;
        while(number > 0){
            int digit = number%10;
            number /= 10;
            int nextDigit = number/10;
            if(nextDigit > 1)
                continue;
            if(nextDigit < 1)
                firstDigit = digit;
        }
      //  System.out.println(firstDigit);
       // System.out.println(lastDigit);
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum( int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit (int num1, int num2){
        if((num1 < 10 || num1 > 99)||(num2 < 10 || num2 > 99)){
            return false;
        }

        // Test for shared digits....
    }
}
