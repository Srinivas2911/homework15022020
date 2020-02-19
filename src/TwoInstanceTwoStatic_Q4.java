public class TwoInstanceTwoStatic_Q4 {
    int a = 4;  // instance variable
    int b = 3; // instance variable
    static int c = 5; // static variable
    static int d = 10; // static variable

    public static void main(String[] args) { //main method - static calling all variables
        TwoInstanceTwoStatic_Q4 obj = new TwoInstanceTwoStatic_Q4(); //object creation
        obj.instanceMethod();
        stat();
    }
    public static void stat (){
        TwoInstanceTwoStatic_Q4 obj = new TwoInstanceTwoStatic_Q4(); //object creation
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);
        int sum3 = obj.a + obj.b;
        int diff = c - d;
        System.out.println("Product of (a+b) & (c-d)"+ "= " +(sum3*diff));
    }
        public void instanceMethod () { // instance method and calling all variables
            System.out.println(a);
            System.out.println(b);
            System.out.println(TwoInstanceTwoStatic_Q4.c);
            System.out.println(TwoInstanceTwoStatic_Q4.d);
            int sum1 = a + b;
            int sum2 = TwoInstanceTwoStatic_Q4.c + TwoInstanceTwoStatic_Q4.d;
            System.out.println("Product of (a+b) & (c+d)"+ "= "+ (sum1*sum2));
        }
    }
