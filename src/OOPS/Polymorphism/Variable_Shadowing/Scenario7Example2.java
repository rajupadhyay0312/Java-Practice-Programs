package OOPS.Polymorphism.Variable_Shadowing;


class OuterDemo1{
    String str = "var from outer class";
    static class InnerDemo{
        static String str = "Var from Inner class";
        public static void m1(){
            System.out.println("m1() from inner class");
            System.out.println(str);
            OuterDemo1 obj = new OuterDemo1();
            System.out.println(obj.str);
        }
    }
    public static void m2(){
        System.out.println("m2() from outer class");
        InnerDemo.m1();
    }
}
public class Scenario7Example2 {
    public static void main(String[] args) {
        OuterDemo1.m2();
    }
}
