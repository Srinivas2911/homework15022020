import java.util.Scanner;

public class StringLowerCase_15 {

    public static void main(String[] args) {
        String line ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a String : ");
        line = scan.nextLine();
        line = line.toLowerCase();
        System.out.println("String in lower case :");
        System.out.println(line);
    }
}
