import java.util.Scanner;

public class Rectangle_10 {

    public static void main(String[] args) { // main method
        Scanner scan = new Scanner(System.in); //scanner
        double w ; // define variable
        double h ;
        System.out.println("Width = ");
        w = scan.nextDouble();
        System.out.println("Height = ");
        h = scan.nextDouble();

        double myArea = (w*h);
        double myPerimeter = 2*(w+h);

        System.out.println("Area is " + w+ "*"+ h+ " = "+ myArea);
        System.out.println("Perimeter is "+  "2"+"*"+"("+ w+ "+"+ h+")"+ "="+ myPerimeter);
    }
}
