public class OneinstanceOneStaticVariables_Q3 {

    int a = 100;  // instance variable
    static int b = 50; // static variable

    public static void main(String[] args) { //main method - static
        OneinstanceOneStaticVariables_Q3 obj = new OneinstanceOneStaticVariables_Q3(); //object creation
        obj.instanceMethod();
        statMethod ();
    }
    public void instanceMethod() { // instance method and calling the variables
        int Diff = a - OneinstanceOneStaticVariables_Q3.b;
        System.out.println(a);
        System.out.println(OneinstanceOneStaticVariables_Q3.b);
        System.out.println("Diff of a & b"+ " = " + (Diff));
    }
    public static void statMethod () {
        OneinstanceOneStaticVariables_Q3 obj = new OneinstanceOneStaticVariables_Q3();
        System.out.println(obj.a);
        System.out.println(b);
        int Sum = obj.a + b;
        System.out.println("Sum of a & b " + "= " + (Sum));
    }

}
