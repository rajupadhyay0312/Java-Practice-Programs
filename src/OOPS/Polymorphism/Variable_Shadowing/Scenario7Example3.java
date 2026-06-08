package OOPS.Polymorphism.Variable_Shadowing;


class OuterDemo2{
    String str = "var from outer class";

    static class InnerDemo{
        String str = "Var from Inner class";
        public void m1(){
            System.out.println("m1() from inner class");
            OuterDemo2 obj = new OuterDemo2();
            System.out.println(obj.str);
            System.out.println(str);
        }
    }
    public static void m2(){
        System.out.println("m2() from outer class");
        InnerDemo obj = new InnerDemo();
        obj.m1();
    }
}
public class Scenario7Example3 {
    public static void main(String[] args) {
        OuterDemo2.m2();
    }
}
