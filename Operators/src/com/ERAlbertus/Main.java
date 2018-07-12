package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    System.out.println("1 + 2 = " +result);

	    int previousResult = result;

	    result = result - 1;
        System.out.println("result = " + result);
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;

        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result +=2;
        System.out.println("Result is now " + result);

        result *=10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien!");

        // Note that the if statement does not have {} after it...these are not necessary in this case since no ';' is entered on the line which tells java to include the line below in the if statement

        //so then..

        // if(isAlien == false)
        //            System.out.println("It is not an alien!");
        // is equivalent to....
        // if(isAlien == false){ System.out.println("It is not an alien!");}
        // but NOT equivalent to...
         //   if(isAlien == false);
         //       System.out.println("It is not an alien!");



        int topScore = 80;
        if(topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");
    }
}
