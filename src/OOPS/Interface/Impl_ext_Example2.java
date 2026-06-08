package OOPS.Interface;

/*
* Note :- 1. If a class extends another class and implements interface at same time if
*          both contain behaviour with same signature then it always access from class
*         2. In this case it is not possible to access the method from interface directly.
*         3. so in this case we have to override the method present inside the interface
*            and access it using super keyword.
* */
class Example111{
    public void m1(){
        System.out.println("m1() class");
    }
}
interface InterFaceA{
    default public void m1(){
        System.out.println("m1() Interface");
    }
}
public class Impl_ext_Example2 extends Example111 implements InterFaceA {
    public void m1(){
        super.m1();
      InterFaceA.super.m1();
    }
    public static void main(String[] args) {
        Impl_ext_Example2 obj = new Impl_ext_Example2();
        obj.m1();
    }
}
