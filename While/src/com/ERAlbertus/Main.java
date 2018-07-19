package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        while(count != 6){
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

    // FOR LOOP BELOW IS NOT IDENTICAL TO THE ABOVE WHILE LOOP!
    // for(int i = 1; i<7; i++){
      //  System.out.println("Count value is " + count);
        // }
//        for(int i=1; i<7; i++){
//            System.out.println("count value is " + count);
//            count++;
//        }
//
//        for(count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }


        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count != 6);

        System.out.println(isEvenNumber(38));

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenCount ++;

            System.out.println("Even number " + number);
            if(evenCount == 5){
                System.out.println("evenCount is " + evenCount);
                break;
            }

        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
    }



    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false.

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
