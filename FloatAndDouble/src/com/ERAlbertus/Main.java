package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes).
	  int myIntValue = 5/2;
	    //width of float = 32 (4 bytes).
	  float myFloatValue = 5f/2f;
	    //width of double = 64 (8 bytes).
	  double myDoubleValue = 5d/2d;
	  System.out.println("myIntValue = "+myIntValue);
	  System.out.println("myFloatValue = "+ myFloatValue);
	  System.out.println("myDoubleValue = "+myDoubleValue);

	    // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
            double pounds = 10d;
        // 2. Calculate the number of Kilograms for the number about and store in a variable
            double kilos = 0.45359237d*pounds;
        // 3. Print out the result.
            System.out.println(pounds + " is equal to " + kilos+"kilograms");
        // Notes: 1 pound is equal to 0.45359237 kilograms.
    }
}
