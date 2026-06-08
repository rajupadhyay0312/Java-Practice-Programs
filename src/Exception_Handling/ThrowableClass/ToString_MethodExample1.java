package Exception_Handling.ThrowableClass;

public class ToString_MethodExample1 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            int a=10/0;
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
            System.out.println(ae.toString());
        }
    }
}
