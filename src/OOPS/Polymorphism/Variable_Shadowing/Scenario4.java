package OOPS.Polymorphism.Variable_Shadowing;

class Parent{
    String str ="PARENT VAR";
}
class Child extends Parent{
    String str = "CHILD VAR";

    public void m1(){
        System.out.println(str);
        System.out.println(super.str);
    }
}
public class Scenario4 {
    public static void main(String[] args) {
        new Child().m1();
    }
}
