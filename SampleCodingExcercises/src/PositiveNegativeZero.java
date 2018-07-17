import java.text.DecimalFormat;

public class PositiveNegativeZero {

    public static void main(String[] args){

        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));

    }
    public static void checkNumber(int number) {
        if(number > 0){
            System.out.println("positive");
        }else if(number < 0) {
            System.out.println("negative");
        }
        System.out.println("zero");


    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = (int) Math.floor(kiloBytes/1024);
        int remainder =  (int) kiloBytes%1024;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "+remainder+" KB");
        }
    }

    public static boolean bark (boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if(barking){
            if(hourOfDay < 8 || hourOfDay > 22){
                return true;
            }
        }
        return false;
    }

    public static boolean isLeapYear (int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0 && year % 100 != 0){
                return true;
            }else if(year % 400 == 0){
                return true;
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2){
        //System.out.println(Math.abs(number1-number2));
        DecimalFormat df = new DecimalFormat("###.###");

        if(Integer.parseInt(df.format(Math.abs(number1 - number2))) >= 0.001){
            return false;
        }else{}
        return true;
    }
    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2){
        if((number1 < 0 && number2 > 0)||(number2 < 0 && number1 > 0)){
            return false;
        }
        double num1 = Math.floor(Math.abs(number1)* 1000d) / 1000d;
        double num2 = Math.floor(Math.abs(number2)* 1000d) / 1000d;
        System.out.println(num1);
        System.out.println(num2);
        double num3 = Math.round(Math.abs(num1-num2)*1000d)/1000d;
        System.out.println(num3);
        if(num3 >= 0.001){
            return false;
        }
        return true;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if(num1 + num2 == num3){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if((num1 >= 13 && num1 <= 19)||(num2 >= 13 && num2 <= 19)||(num3 >= 13 && num3 <= 19)){
            return true;
        }
        return false;
    }

}
