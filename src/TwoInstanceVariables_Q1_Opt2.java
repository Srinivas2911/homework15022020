public class TwoInstanceVariables_Q1_Opt2 {
    // instance variable
    int a = 50;  // always declared in class
    int b = 100;

    public static void main(String[] args) { //main method
        TwoInstanceVariables_Q1_Opt2 obj = new TwoInstanceVariables_Q1_Opt2(); //object creation
        obj.mycal();
    }
    public void mycal() { // instance method and calling the instance variables
        int Sum = a+b;
        int Diff = a-b  ;
        System.out.println("Sum " + "of " + "a " + "and " + "b " + "= " + (Sum));
        System.out.println("Difference " + "of " + "a " + "and " + "b " + "= " + (Diff));
    }
}

