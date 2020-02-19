import java.util.Scanner;
public class AverageThreeNumbers_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a;
        int b;
        int c;
        System.out.println( "Choose first number  :");
        a = scan.nextInt();
        System.out.println( "Choose second number :");
        b = scan.nextInt();
        System.out.println( "Choose third number  :");
        c = scan.nextInt();

        int result = (a+b+c)/3 ;
        System.out.println("Average of 3 numbers"+" = "+ result);

    }
}
