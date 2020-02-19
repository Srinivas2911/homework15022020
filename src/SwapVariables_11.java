import java.util.Scanner;

public class SwapVariables_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,temp;

        System.out.println("Enter first number : ");
        a = scan.nextInt();
        System.out.println("Enter second number : ");
        b = scan.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped Numbers : "+ a+ ","+ b);
    }
}
