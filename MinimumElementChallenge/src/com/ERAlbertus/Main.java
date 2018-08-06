package com.ERAlbertus;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegers = readIntegers(6);

        System.out.println("THe minimum is " + findMin(myIntegers));
    }

    public static int [] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values.\r");

        int[] values = new int [count];

        for(int i = 0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin( int [] array){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
