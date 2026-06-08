package OOPS.Polymorphism.Method_Overloading;

class Example125{
    public static void m1(){
        System.out.println("m1()");
    }
}
class Example126 extends Example122{
    public void m1(int a){
        System.out.println("m1(int a)");
    }
}
public class Example5 {
    public static void main(String[] args) {
        Example126 obj  = new Example126();
        //obj.m1();
        obj.m1(10);
    }
}
