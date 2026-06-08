package OOPS.Polymorphism.Method_Shadowing;

class Parent6{
    public static Object m1(){
        System.out.println("Parent");
        return null;
    }
}
class Child6 extends Parent6{
    public static StringBuffer m1(){
        System.out.println("Child");
        return null;
    }
}
public class Example8 {
    public static void main(String[] args) {
        Parent6.m1();
        Child6.m1();

    }
}
