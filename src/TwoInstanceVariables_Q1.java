public class TwoInstanceVariables_Q1 {
    //instance variables
    String name1 = "Roger Perera ";
    int age = 56;

    public static void main(String[] args) { //main method
        TwoInstanceVariables_Q1 obj = new TwoInstanceVariables_Q1();
        obj.bioData();
    }
        public void bioData  () { // instance variable call
            System.out.println("My name is "+ "="+ name1);
            System.out.println("My age  is "+ "="+ age);
        }

    }