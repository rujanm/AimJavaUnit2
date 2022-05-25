import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2_2 {
    
    public static void main(String args[]) {
        System.out.println("Given a year and a month in that year, this program will tell you ");
        System.out.println("the number of days in that month.");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int MonthNumber = input.nextInt();


        if(MonthNumber > 12 || MonthNumber < 1) {
            System.out.println("\n" + MonthNumber + " is invalid." + "The value for the month must be between 1 and 12, inclusive \n \n");
            System.out.println("Goodbye...");
            System.exit(0);
        }

        
        int DaysInFebruary = 28;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){

            DaysInFebruary = 29;
        }

        int[] NumOfDaysInMonths = {31,DaysInFebruary,31,30,31,30,31,31,30,31,30,31};

        String[] months = new String[]{"January","February","March","April",
        "May","June","July","August","September","October","November","December"};
        System.out.println("\n \n" + months[MonthNumber - 1] + " of " + year + " has " + NumOfDaysInMonths[MonthNumber - 1] + " days in it\n \n");
        System.out.println("Goodbye...");
        

    }
}
