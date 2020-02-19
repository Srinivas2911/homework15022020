import java.util.Scanner;

public class CalculatorSimpleMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a ;
        int b ;
        System.out.print("Input first number :");
        a = scan.nextInt();
        System.out.print("Input second number :");
        b = scan.nextInt();

        System.out.println(("Sum  ") + "=" + (a + b));
        System.out.println(("Diff ") + "=" + (a - b));
        System.out.println(("Prod ") + "=" + (a * b));
        System.out.println(("Div  ") + "=" + (a / b));
    }
}
