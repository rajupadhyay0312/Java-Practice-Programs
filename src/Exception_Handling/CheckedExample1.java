package Exception_Handling;

public class CheckedExample1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        m1();
        System.out.println("JAVA");
    }
    public static void m1() throws ArithmeticException{
        System.out.println("Hello I am m1()");
    }
}
