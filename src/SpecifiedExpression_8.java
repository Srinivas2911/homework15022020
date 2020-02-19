import java.util.Scanner;

public class SpecifiedExpression_8 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        Scanner scan = new Scanner(System.in);
        System.out.print("input first number : ");
        a = scan.nextDouble();
        System.out.print("input second number : ");
        b = scan.nextDouble();
        System.out.print("input third number : ");
        c = scan.nextDouble();
        System.out.print("input fourth number :");
        d = scan.nextDouble();

        double result = ((a*b-b*b)/(c-d));
        System.out.print("Result : (" + a+ "*"+ b);
        System.out.print("-"+ b+ "*"+ b+ ")"+ "/");
        System.out.println("("+ c+ "-"+ d+ ")");

        System.out.println(" = "+ result);

    }
}
