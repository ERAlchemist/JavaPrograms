package com.ERAlbertus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int min = 2147483647;  // the highest value an int can be
	    int max = -2147483648; // the lowest value an int can be

	    while(true){
            System.out.println("Enter number:");
	        boolean isAnInt = scanner.hasNextInt();

	        if(isAnInt){
	            int validInt = scanner.nextInt();
	            if(validInt < min){
	                min = validInt;
                }
                if(validInt > max){
	                max = validInt;
                }
            }else{
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); // handle input
        }

        System.out.println("Min is " + min);
        System.out.println("Max is " + max);

        scanner.close();
    }
}
