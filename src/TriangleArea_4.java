import java.util.Scanner;

public class TriangleArea_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //area of triangle = (height x base)/2
        int h ;
        int b ;
        System.out.print("Input Height of the triangle = ");
        h = scan.nextInt();
        System.out.print("Input Base of the triangle = ");
        b = scan.nextInt();

        int Area = (h*b/2);
        System.out.print("Area of the triangle = "+ Area);

          }
}
