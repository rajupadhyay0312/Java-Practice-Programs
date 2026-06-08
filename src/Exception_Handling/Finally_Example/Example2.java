package Exception_Handling.Finally_Example;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("START");
        try{
            System.out.println("try");
            System.out.println(1/0);
        }catch(ArithmeticException ae){
            System.out.println("Catch");
            return;
        }finally{
            System.out.println("finally");
        }
        System.out.println("ends");
    }
}
