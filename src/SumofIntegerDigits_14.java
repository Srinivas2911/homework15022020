import java.util.Scanner;

public class SumofIntegerDigits_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer : ");
        long n = scan.nextLong();
        System.out.println("Sum of the digits : " + addDigits(n));
    }

    public static int addDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
