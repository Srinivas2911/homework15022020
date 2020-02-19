import java.util.Scanner;
public class DecimalToBinary_13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a Decimal Number : ");
        int a = scan.nextInt();

        String b = Integer.toBinaryString(a);

        System.out.print("Binary number is: "+b);
    }
}
