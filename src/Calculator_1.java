import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Print first number : ");
        a = scan.nextInt();
        System.out.print("Print second number :");
        b = scan.nextInt();

        Calculator_1 cal = new Calculator_1();
        cal.addition(a,b);
        subtraction(a,b);
        cal.multiply (a,b);
        divide (a,b);

    }

    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Add Value = "+ result);
    }
    public void multiply (int a, int b) {
        int result = a*b;
        System.out.println("Multiply Value = "+ result);
    }
    public static void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Difference Value = "+ result);
    }
    public static void divide (int a, int b) {
        int result = a/b;
        System.out.println("Divide value = "+ result);
    }


}
