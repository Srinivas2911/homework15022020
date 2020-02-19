import java.util.Scanner;
import java.util.Date; //date and time import

public class PrintReceipt_16 {
    public static void main(String[] args) { // main method
        Scanner scan = new Scanner(System.in);
        double a; // define variable defined
        System.out.println("Gallons : ");
        a = scan.nextDouble();
        double b = 2.089; // price fixed for the day
        double result = a * b; // total price t reflect.

        Date obj = new Date(); // calling date by obj

        System.out.println("''+------------------------------+''");
        System.out.println("''|                              |''");
        System.out.println("''|        CORNER STORE          |''");
        System.out.println("''|                              |''");
        System.out.println("''| " + obj + " |''");
        System.out.println("''|                              |''");
        System.out.println("''| Gallons         : " + a +"      |''");
        System.out.println("''| Price/Gallons   :$" + b + "      |''");
        System.out.println("''|                              |''");
        System.out.println("''| Fuel Total      :$" + result +"   |''");
        System.out.println("''|                              |''");
        System.out.println("''+------------------------------+''");

    }
}