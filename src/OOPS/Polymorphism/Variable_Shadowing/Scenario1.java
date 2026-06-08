package OOPS.Polymorphism.Variable_Shadowing;

//  Instance variable shadow by local variable
class Demo{
    String str = "Instance var";

    Demo(){
        String str ="Local var";
        System.out.println(str);
        System.out.println(this.str);
    }
    {
        String str =" Local var";
        System.out.println(str);
        System.out.println(this.str);
    }
    public void m1(){
        String str = " Local var";
        System.out.println(str);
        System.out.println(this.str);
    }
}
public class Scenario1 {
    public static void main(String[] args) {
        new Demo().m1();
    }
}
