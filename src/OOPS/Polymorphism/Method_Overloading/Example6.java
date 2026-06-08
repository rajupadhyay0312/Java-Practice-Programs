package OOPS.Polymorphism.Method_Overloading;


class Example127{
    public void m1(){
        System.out.println("m1()");
    }
}
class Example128 extends Example127{
    public static void m1(int a){
        System.out.println("m1(int a)");
    }
}
public class Example6 {
    public static void main(String[] args) {
        Example128 obj = new Example128();
        obj.m1();
        obj.m1(10);
    }
}
