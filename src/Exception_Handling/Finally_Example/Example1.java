package Exception_Handling.Finally_Example;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            return;
        }
        catch(ArithmeticException ae){
            System.out.println("Exception");
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
