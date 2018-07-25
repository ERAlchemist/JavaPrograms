package com.ERAlbertus;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int validNumberCount = 0;
        int sum = 0;
        while(validNumberCount < 10){
            int num = validNumberCount + 1;
            System.out.println("Enter number #" + num + ":");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int validInt = scanner.nextInt();

                sum += validInt;

                validNumberCount ++;

            }else{
                System.out.println("Invalid Number");
                return;
            }
            scanner.nextLine();  //handle end of line (enter key)
        }
        System.out.println("Sum is "+sum);
        scanner.close();
    }
}
