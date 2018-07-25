package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));
        System.out.println("*******************");
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println("..................");
        printSquareStar(5);
        printSquareStar(8);
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if(goal == 0)
            return true;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(bigCount == 0){
            if(goal % smallCount == 0 || smallCount > goal){
                return true;
            }
        }
        if(smallCount == 0){
            if(goal % (bigCount*5) == 0 ){
                return true;
            }
        }
        if(smallCount > 0 && bigCount > 0){
            if( goal % ((bigCount*5) + smallCount) == 0 ){
                return true;
            }
            if( (bigCount*5 + smallCount) > goal) {
                return true;
            }
        }
       return false;
}

    public static int getLargestPrime (int number) {
        if (number <= 0 || number == 1 )
            return -1;
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }

    public static void printSquareStar (int number){

        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number || i == j || i == (number-(j-1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
             }
            System.out.println("");
        }


        }


}
