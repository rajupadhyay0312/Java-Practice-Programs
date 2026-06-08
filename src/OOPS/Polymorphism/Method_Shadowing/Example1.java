package OOPS.Polymorphism.Method_Shadowing;

class Parent{
    public static void  m1(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    public static void m1(){
        System.out.println("child");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.m1();

        Parent obj1 = obj;//Upcasting
        obj1.m1();

        Child obj2 = (Child) obj1; // downCasting
        obj2.m1();
    }
}
