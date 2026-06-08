package OOPS.Polymorphism.Method_Shadowing;

class Parent2{
    public void m1(){
        System.out.println("Parent");
    }
}
class Child2 extends Parent2{
//    public static void m1(){          // m1() in Child2 cannot override m1() in Parent2
//        System.out.println("Child");
//    }
}
public class Example4 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
