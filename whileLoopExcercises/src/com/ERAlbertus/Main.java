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
        System.out.println("**************************");
        System.out.println(hasSameLastDigit(22, 11, 32));
        System.out.println(hasSameLastDigit(24, 11, 32));
        System.out.println("*****************");
        printFactors(35);
        printFactors(120);
        System.out.println("***************");
        System.out.println(isPerfectNumber(24));
        System.out.println(isPerfectNumber(6));
        System.out.println(reverse(1222));
        numberToWords(1001);
        System.out.println("............");
        numberToWords(2001);
        System.out.println(".................");
        numberToWords(1000);
        System.out.println(".................");
        numberToWords(53460);
        System.out.println(".................");
        numberToWords(12300);
        System.out.println(".................");
        numberToWords(0);
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

//    public static boolean hasSharedDigit (int num1, int num2){
//        if((num1 < 10 || num1 > 99)||(num2 < 10 || num2 > 99)){
//            return false;
//        }
//
//        // Test for shared digits....
//    }

    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if( (num1 < 10 || num2 < 10 || num3 < 10 )||(num1 > 1000 || num2 > 1000 || num3 > 1000) ){
            return false;
        }
        int num1Digit = num1%10;
        int num2Digit = num2%10;
        int num3Digit = num3%10;

        if(num1Digit == num2Digit || num2Digit == num3Digit || num1Digit == num3Digit){
            return true;

        }
        return false;
    }

    public static void printFactors (int number) {
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int factor = 0;
        while(factor < number){
            factor++;
            if(number%factor == 0){
                System.out.println(factor);

           }else{
              continue;
         }

        }
    }

    public static boolean isPerfectNumber (int number){
        if(number < 1){
            return false;
        }
        int factor = 0;
        int sum = 0;
        while(factor < number){
            factor++;
            if(number%factor == 0 && number != factor){
                System.out.println("factor is " + factor);
                sum += factor;
            }else{
                continue;
            }
        }
        System.out.println("sum is " + sum);
        return sum == number;
    }
    public static void numberToWords (int num){
        if(num == 0){
            System.out.println("Zero");
        }
        int number = reverse(num);
        int digitCount = getDigitCount(num);
        int revCount = getDigitCount(number);
//        if(revCount < digitCount){
//            number = reverse(number);
//            for(int i = revCount; i < digitCount; i++){
//                number *= 10;
//            }
  //      }
        // System.out.println("")
        while(number > 0){
            int digit = number % 10;
            switch(digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            number /=10;
        }
        if(revCount < digitCount){
            for(int i = revCount; i < digitCount; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse (int number){
        //this should be revised

        String numString = "";
        while(number > 0){
            int digit = number % 10;
            numString += ""+digit+"";
            number /= 10;
        }
        if(number < 0){
            return -1*Integer.parseInt(numString);
        }
        return Integer.parseInt(numString);
    }

    public static int getDigitCount (int number){
        if(number < 0)
            return -1;
        String str = Integer.toString(number);
        return str.length();
    }
}
