public class Main {

    public static void main (String [] args){
        printNumberWord(0);
        printNumberWord(1);
        printNumberWord(2);
        printNumberWord(5);
        printNumberWord(9);
        printNumberWord(10);
        System.out.println(isLeapYear(-1));
        System.out.println(isLeapYear(1998));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(3,2020));
        System.out.println(getDaysInMonth(2,2000));
    }

    public static void printNumberWord(int number) {

        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear (int year) {

        if( year < 0 || year > 9999)
            return false;
        if( (year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0) ){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year){
        if( month < 1 || month > 12)
            return -1;
        if(year < 1 || year > 9999)
            return -1;
        int extraDay = 0;
        int daysInMonth = 0;
        if(isLeapYear(year))
            extraDay = 1;
        switch(month){
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28 + extraDay;
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;

            }
            return daysInMonth;
    }
}
