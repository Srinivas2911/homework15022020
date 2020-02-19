import java.util.Scanner;

public class JavaPattern_7 {

    public static void main(String[] args) { //declaration of main method
        Scanner scan = new Scanner(System.in);
// definng strings
        System.out.println("Enter first character :");
        String j = scan.next();
        j = j.toUpperCase(); // defining upper case
        System.out.println("Enter second character :");
        String a = scan.next();
        a = a.toLowerCase(); //defining lower case
        System.out.println("Enter third character :");
        String v = scan.next();
        v = v.toLowerCase();
        String V;
        V = v.toUpperCase();
        JavaPattern_7 obj = new JavaPattern_7(); //instance method calling
        obj.myPattern(j, a, v, V);
    }

    public void myPattern(String j, String a, String v, String V) { //instance method

        System.out.println("   " + j + "    " + a + "   " + v + "     " + v + "  " + a + "  ");
        System.out.println("   " + j + "   " + a + " " + a + "   " + v + "   " + v + "  " + a + " " + a);
        System.out.println(j + "  " + j + "  " + a + a + a + a + a + "   " + V + " " + V + "  " + a + a + a + a + a);
        System.out.println(" " + j + j + "  " + a + "     " + a + "   " + V + "  " + a + "     " + a);
    }
}
