package OOPS.Interface;


//How does java resolved diamond problem in interface for default method
/// 1.Whenever the diamond problem occurs in interface,child interface has to mandatory to
/// override the default method or else it's throw CTE
interface ParentA{
    default public void m1(){
        System.out.println("Parent m1()");
    }
}
interface ParentB{
    default public void m1(){
        System.out.println("Parent m1()");
    }
}
interface Child1 extends ParentA, ParentB{
    @Override
    default public void m1(){
        ParentA.super.m1();
        ParentB.super.m1();
        System.out.println("Child Interface");
    }
}
class Demo12 implements Child1{ }
public class Default_MethodExample1 {
    public static void main(String[] args) {
        Demo12 obj = new Demo12();
        obj.m1();

    }
}
