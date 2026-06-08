package OOPS.Polymorphism.Method_Shadowing;

class Parent9{
    public static int m1(){
        System.out.println("parent");
        return 10;
    }
}
class Child9 extends Parent9{
//    public static byte m1(){          //return type byte is not compatible with int
//        System.out.println("child");
//        return 123;
    //}
}
public class Example11 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
