package OOPS.Polymorphism.Method_Shadowing;

class Parent8{
    public static int m1(){
        System.out.println("parent");
        return 10;
    }
}
class Child8 extends Parent8{
//    public static void m1(){          //return type void is not compatible with int
//        System.out.println("child");
//        return null;
//    }
}
public class Example10 {
}
