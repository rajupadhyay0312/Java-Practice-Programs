package OOPS.Polymorphism.Variable_Shadowing;

//static variable shadowed by local variable

class Demo1{
    static String str = "GLOBAL STATIC VAR";
    public static void m1(){
        String str = "LOCAL VAR";
        System.out.println(str);
        System.out.println(Demo1.str);
    }
    public void m2(){
        m1();
        String str = "LOCAL VAR";
        System.out.println(str);
        System.out.println(Demo1.str);
    }
}
public class Scenario5 {
    public static void main(String[] args) {
        new Demo1().m2();
    }
}
