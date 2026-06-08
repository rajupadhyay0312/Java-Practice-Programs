package OOPS.Polymorphism.Method_Shadowing;


class Parent7{
    public static String m1(){
        System.out.println("Parent");
        return null;
    }
}
class Child7 extends Parent7{
//    public static void m1(){
//        return null;
//    }
}
public class Example9 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
