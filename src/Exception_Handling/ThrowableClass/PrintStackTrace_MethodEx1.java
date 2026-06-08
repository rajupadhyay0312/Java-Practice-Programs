package Exception_Handling.ThrowableClass;

public class PrintStackTrace_MethodEx1 {
    public static void main(String[] args) {
        m2();
    }
    public static void m2(){
        Demo.m1();
    }
}
class Demo{
    public static void m1(){
        System.out.println("start");
        try{
            System.out.println("try");
            int a=10/0;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("ends");
    }
}
