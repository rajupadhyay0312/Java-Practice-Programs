package Exception_Handling.ThrowableClass;

public class ThrowExample1 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            throw new ArithmeticException();
        }catch(ArithmeticException e){
            System.out.println("catch");
        }
    }
}
