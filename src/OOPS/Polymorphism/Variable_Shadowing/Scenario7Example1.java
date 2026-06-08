package OOPS.Polymorphism.Variable_Shadowing;

//Inner class variable shadowed outer variable

class OuterDemo{
    static String str = "Var from outer class";

    static class InnerDemo{
        static String str = "Var from Inner class";
        public static void m1(){
            System.out.println("m1() from inner class");
            System.out.println(str);
            System.out.println(OuterDemo.str);
        }
    }
    public static void m2(){
        System.out.println("m2() from outer class");
        InnerDemo.m1();
    }
}
public class Scenario7Example1 {
    public static void main(String[] args) {
        OuterDemo.m2();
    }
}
