package com.ERAlbertus;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        Integer [] myIntegers = getIntegers(6);

        printArray(myIntegers);
        System.out.println("Your numbers in descending order...");
        for(int i = 0; i < myIntegers.length; i++) {
            Integer [] arr = sortIntegers(myIntegers);
            System.out.println(arr[i]);
        }
    }

    public static Integer [] getIntegers (int number){
        System.out.println("Enter " + number + " integer values.\r");

        Integer [] values = new Integer[number];

        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray (Integer [] array) {
        System.out.println("Your array of numbers is : ");
        for(int i = 0; i< array.length; i++) {
            System.out.print(""+array[i]+", ");
        }
        System.out.println("...");
    }


    public static Integer [] sortIntegers (Integer [] array) {

       Arrays.sort(array, Collections.reverseOrder());

       return array;
    }
}
