package OOPS.Polymorphism.Method_Overloading;

class Example122{
    public void m1(int a){
        System.out.println("m1(int a)");
    }
//    public static void m1(int a){
//        System.out.println("m1(int a)");
//    }
}
public class Example3 {
    public static void main(String[] args) {
        Example122 obj = new Example122();
        obj.m1(10);
        //Example122.m1(10);
    }
}
