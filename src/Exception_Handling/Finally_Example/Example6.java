package Exception_Handling.Finally_Example;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(10/0);
        try{
            System.out.println("try");
        }
        catch(ArithmeticException ae){
            System.out.println("outer catch");
        }finally{
            System.out.println("outer finally");
        }
        System.out.println("end");
    }
}
