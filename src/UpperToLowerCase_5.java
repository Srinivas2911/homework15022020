import java.sql.SQLOutput;
import java.util.Scanner;

public class UpperToLowerCase_5 {


    public static void main(String[] args) {
        char ch ;
        int temp ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a Character in Upper Case : ");
        ch = scan.next().charAt(0);

        temp = (int) ch;
        temp = temp+32;
        ch = (char)temp;

        System.out.println("Result in lower case : "+ch);

    }

}
