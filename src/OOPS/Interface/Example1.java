package OOPS.Interface;

interface A{
    void m1();
    void m2();
}
interface B extends A{
    void m3();
}
abstract class D implements B{
    public void m1(){
        System.out.println("m1() imp by classD");
    }
    public void m2(){
        System.out.println("m2() imp by classD");
    }
}
class E extends D {
    public void m3(){
        System.out.println("m3() extend by class D");
    }
}
interface C extends A{

}
class F implements C{
   public void m1(){
       System.out.println("m1() imp by class F");
   }
   public void m2(){
       System.out.println("m2() imp by class F");
   }
   public void m3(){
       System.out.println("m3() class F");
   }
}
public class Example1 {
    public static void main(String[] args) {
        E obj1 = new E();
        obj1.m3();

        F obj2 = new F();
        obj2.m1();
        obj2.m2();
        obj2.m3();
    }
}
