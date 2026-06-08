package OOPS.Polymorphism.Method_Shadowing;

class Parent11{
    public static int m1(){
        System.out.println("parent");
        return 10;
    }
}
class Child11 extends Parent11{
    public static int m1(){          //return type int is  compatible with int
        System.out.println("child");
        return 123;
    }
}
public class Example12 {
}
