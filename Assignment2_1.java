import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment2_1 {

    public static void main(String[] args) {
        
    System.out.println("This program converts a temperature in degrees Celsius into a" +
    "temperature in degrees Fahrenheit.");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in degrees Celsius: ");

        double celsius = input.nextDouble();
        double fahrenheit = (9/5) * celsius + 32;

        
        System.out.printf(String.format("%.2f", celsius) + 
        " degrees celsius is equal to " + String.format("%.2f",fahrenheit) + 
        " degrees fahrenheit \n \n");


        System.out.println("Goodbye...");

        
    }
}