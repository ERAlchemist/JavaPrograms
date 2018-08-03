package com.ERAlbertus;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//	    int [] intArray = new int [10];
//
//	  //  intArray [5] = 50;
//	    int [] newArray = {1,2,3,5,6,7,8,9,10};
//	    double[] myDoubleArray = new double[10];
//        System.out.println(intArray[5]);
//        System.out.println(newArray[4]);
//
//        for(int i = 1; i<intArray.length; i++){
//            intArray[i] = i*10;
//        }
//
//    public static void printArray(int[] array){
//            for (int i = 0; i < array.length; i++) {
//                System.out.println("element " + i + ", value is " + array[i]);
//
//            }
//        }
        int [] myIntegers = getIntegers(5);

        for(int  i = 0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int [] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int [] values = new int[number];

        for( int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for(int i = 0; i< array.length; i++){
            sum += array[i];
        }

        return (double) sum/ (double)array.length;
    }
}
