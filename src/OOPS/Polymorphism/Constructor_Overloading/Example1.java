package OOPS.Polymorphism.Constructor_Overloading;

class Demo{
    Demo(){
        System.out.println("Demo()");
    }
    public Demo(int a){
        System.out.println("public Demo(int a)");
    }
    protected Demo(String str, int a){
        System.out.println("Protected Demo(String str, int a)");
    }
}
public class Example1 {
    public static void main(String[] args) {
        new Demo();
        new Demo(123);
        new Demo("Hello java",1234);
    }
}
