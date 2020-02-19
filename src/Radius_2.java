import java.util.Scanner;

public class Radius_2 {

    public static void main(String[] args) {
        //area = PI x radius x radius
        Scanner scan = new Scanner(System.in);
        double r;
        float PI= 3.14f; //value of Pi

        System.out.print("Input Radius : ");
        r = scan.nextFloat();

        double area = PI*r*r;
        //double area2= Math.PI*r*r;
        System.out.println(("Area of the circle =")+ area);

        //System.out.println(("Area of the circle =")+ area2);

    }
}
