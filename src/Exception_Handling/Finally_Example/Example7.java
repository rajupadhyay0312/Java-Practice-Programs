package Exception_Handling.Finally_Example;

public class Example7 {
    public static void main(String[] args) {
        System.out.println("start");
        m1();
        System.out.println("main() ends ");
    }
    public static void m1(){
        System.out.println("m1() start");
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println("outer catch 1");
        }
        finally{
            System.out.println("outer finally");
        }
        System.out.println("m1() ends");
    }
}
