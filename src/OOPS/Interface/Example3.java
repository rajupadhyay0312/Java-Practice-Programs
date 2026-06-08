package OOPS.Interface;

//A class can implements more than 1 interface at a time
interface Example12{
    void m1();
}
interface Example13{
    void m2();
}
class Demo1 implements Example12, Example13{
    @Override
    public void m1(){
        System.out.println("m1() impl by Demo class");
    }
    @Override
    public void m2(){
        System.out.println("m2() impl by Demo class");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.m1();
        obj.m2();
    }
}
