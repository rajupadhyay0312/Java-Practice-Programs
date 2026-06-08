package OOPS.Interface;

interface Parent{
    void m1();
      static void m3(){
        System.out.println("Parent m3() static");
    }
}
class Child implements Parent{
    @Override
    public void m1(){
        System.out.println("child m1()");
    }
}
public class Static_Method_Java8 {
    public static void main(String[] args) {
            Child obj = new Child();
            obj.m1();
            Parent.m3();
           // obj.m3(); //CTE
    }
}
