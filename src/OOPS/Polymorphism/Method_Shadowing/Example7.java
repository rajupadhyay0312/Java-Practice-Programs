package OOPS.Polymorphism.Method_Shadowing;

class Parent5{
    public static String m1(){
        System.out.println("Parent");
        return null;
    }
}
class Child5 extends Parent5{
    public static String m1(){
        System.out.println("Child");
        return null;
    }
}
public class Example7 {
    public static void main(String[] args) {

    }
}
