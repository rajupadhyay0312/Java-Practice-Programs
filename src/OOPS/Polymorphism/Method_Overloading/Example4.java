package OOPS.Polymorphism.Method_Overloading;

class Example123{
    public void m1(){
        System.out.println("m1()");
    }
}
class Example124 extends Example123{
   public void m1(int a){
       System.out.println("m1(int a)");
   }
}
public class Example4 {
    public static void main(String[] args) {
        Example124 obj = new Example124();
        obj.m1();
        obj.m1(10);
    }
}
