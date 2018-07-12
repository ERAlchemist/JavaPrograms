package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
        // The 8 basic data types in Java...
        // 1. byte
        // 2. short
        // 3. int
        // 4. long
        // 5. float
        // 6. double
        // 7. char
        // 8. boolean

        // Note that all 8 are lowercase

        // String is a combination of characters
        String myString = "This is a string.";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString +  " \u00A9 2015";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);


    }
}
