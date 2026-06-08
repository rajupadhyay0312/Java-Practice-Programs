package OOPS.Polymorphism.Method_Shadowing;


//A method declare with private modifier cannot be accessed outside it class
class Parent3{
    private static void m1(){
        System.out.println("parent");
    }
}
class Child3 extends Parent3{
    public static int m1(){
        System.out.println("child");
        return 10;
    }
}
public class Example5 {
    public static void main(String[] args) {
        System.out.println("Main");
        //Parent3.m1();
    }
}
