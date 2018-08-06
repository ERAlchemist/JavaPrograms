package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
        int [] arrayList = {1,3,4,5,9,11};
        System.out.println("Array is...");
        for(int i = 0; i < arrayList.length; i++){
            System.out.println(arrayList[i]);
        }
        reverse(arrayList);
        System.out.println("Reversed Array is...");
        for(int i = 0; i < arrayList.length; i++){
            System.out.println(arrayList[i]);
        }
    }

    public static void reverse (int [] array) {

        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for(int i = 0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
