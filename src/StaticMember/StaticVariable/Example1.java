package StaticMember.StaticVariable;

public class Example1 {
    static String str = "STATIC VAR";
    static{
        System.out.println("Static block");
        System.out.println(str);
    }
    public static void m1(){
        System.out.println("m1() static method");
        System.out.println(str);
    }
    public static void main(String[] args){
        System.out.println("main");
        System.out.println(str);
        m1();
        InnerClass.m2();
    }
    static class InnerClass{
        public static void m2(){
            System.out.println("m2() static method from InnerClass");
            System.out.println(str);
        }
    }
}
