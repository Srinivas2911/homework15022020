import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperatureCalc_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float F ; //F=temp in Farenheit
        System.out.print("Temp in Farenheit :");
        F = scan.nextFloat();

        float myCelcius = (F-32)*5/9;

        System.out.print("Temp in Celcius ="+ myCelcius);



    }
}
