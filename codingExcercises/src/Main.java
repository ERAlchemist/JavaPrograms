public class Main {

    public static void main(String args[]){
        System.out.println(area(30, 70));
        System.out.println(area(104));
        printYearsAndDays(525600);
        printEqual(10,10,10);
        printEqual(-1,0,4);
        printEqual(1,1,4);
        printEqual(1,4,10);
        System.out.println(isCatPlaying(true, 42));
    }
    public static double PI = 3.14159;
    public static double area (double radius){

        if(radius < 0)
            return -1.0d;
        return PI*radius*radius;
    }

    public static double area (double x, double y){
        if(x < 0 || y < 0)
            return -1.0d;

        return x*y;
    }

    public static String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static long MINUTES_IN_YEAR = 24*60*365;
    public static void printYearsAndDays(long minutes){
        String message = "";
        if(minutes == 0){
            System.out.println("0 min = 0 y and 0 d");
            return;
        }
        if(minutes > 0){

            long years = minutes/(MINUTES_IN_YEAR);
            long days = (minutes%MINUTES_IN_YEAR)/(60*24);

            String returnString = minutes + " min = ";
            String yearString = years + " y and ";
            String dayString = days + " d";
            message = returnString + yearString + dayString;
        }else{
            message = INVALID_VALUE_MESSAGE;
        }

        System.out.println(message);
    }

    public static void printEqual (int num1, int num2, int num3){
        String message = "";
        if(num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }
        if(num1 == num2 && num2 == num3){
            message = "All numbers are equal";
        }else if ( num1 != num2 && num2 != num3 && num1 != num3){
            message = "All numbers are different";
        }else if (num1 == num2 && num2 != num3 || num2 == num3 && num2 != num1 || num3 == num1 && num1 != num2){
            message = "Neither all are equal or different";
        }

        System.out.println(message);
    }

    public static boolean isCatPlaying (boolean summer, int temperature){
        int highLimit = 35;
        if(summer)
            highLimit = 45;

        if(temperature >= 25 && temperature <= highLimit)
            return true;

        return false;
    }
}
