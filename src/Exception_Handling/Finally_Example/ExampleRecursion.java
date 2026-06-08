package Exception_Handling.Finally_Example;

public class ExampleRecursion {
    public static void main(String[] args) {
        System.out.println("start");
        m1(1);
        System.out.println("main() ends");
    }
    public static void m1(int num){
        System.out.println("Hello "+num);
        try{
            System.out.println("try :"+num);
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println("catch "+num);
            m1(++num);
        }
        finally{
            System.out.println("finally "+num);
        }
    }
}
