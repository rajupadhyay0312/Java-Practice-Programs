package OOPS.Interface;

interface Parent12{
    void m1();
    void m2();

    default void m3(){
        System.out.println("m3() is impl in interface parent");
    }
}
interface ChildA extends Parent12{}
interface ChildB extends Parent12{}
interface ChildC extends Parent12{}

class Example14 implements ChildA{
    @Override
    public void m1(){
        System.out.println("m1() impl from Example14");
    }
    @Override
    public void m2(){
        System.out.println("m2() impl from Example14");
    }
}
class Example15 implements ChildB{
    @Override
    public void m1(){
        System.out.println("m1() impl from Example15");
    }
    @Override
    public void m2(){
        System.out.println("m2() impl from Example15");
    }
}
class Example16 implements ChildC{
    @Override
    public void m1(){
        System.out.println("m1() impl from Example16");
    }
    @Override
    public void m2(){
        System.out.println("m2() impl from Example16");
    }
}
public class Default_BackwardCompatibility {
    public static void main(String[] args) {
        Example16 obj = new Example16();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
