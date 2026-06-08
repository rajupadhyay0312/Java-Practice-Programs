package OOPS.Abstraction;

abstract class Demo{
    public abstract void m1();
    public void m2(){
        System.out.println("Parent m2()");
    }
}
abstract class Example12 extends Demo{
    public void m3(){
        System.out.println("Child class m3()");
    }
}
class Example13 extends Example12{
    public void m1(){
        System.out.println("m1() imp by grandchild");
    }
    public void m4(){
        System.out.println("m4() from grandchild");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Example13 obj = new Example13();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
