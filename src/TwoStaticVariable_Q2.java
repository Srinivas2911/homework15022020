public class TwoStaticVariable_Q2 {

    // static variables
    static String name1 = "India ";
    static int yearOfRep = 1957;

    public static void main(String[] args) { //main method - static method
        System.out.print("Country |");
        System.out.println("Year of Republic");
        stat();
    }
    public static void stat() {  // static variable call
        System.out.print(name1);
        System.out.print("  | ");
        System.out.println(yearOfRep);
    }
}