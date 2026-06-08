package OOPS.Polymorphism.Method_Shadowing;


//Method shadowing we can still access the parent class method using className as reference.
class Parent1{
    public static void m1(){
        System.out.println("Parent");
    }
}
class Child1 extends Parent{
    public static void m1(){
        System.out.println("child");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Parent1.m1();
        Child obj = new Child();
        obj.m1();
        obj=null;
        obj.m1();
    }
}
