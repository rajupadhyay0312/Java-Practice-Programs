package Exception_Handling.ThrowableClass;

public class ThrowExample2 {
    public static void main(String[] args) {
        System.out.println("start");
        throw new ArithmeticException("KuchToh");
        //System.out.println("ends"); //Unreachable stmt
    }
}
