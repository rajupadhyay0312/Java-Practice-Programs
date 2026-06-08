package StaticMember.StaticVariable;

public class Example2 {
    static String str = "STATIC VAR";
    {
        System.out.println("non-static block");
        System.out.println(str);
    }
    public void m1(){
        System.out.println("non-static method m1()");
        System.out.println(str);
    }
    Example2(){
       System.out.println("constructor");
       System.out.println(str);
    }
    public static void main(String[] args){
        System.out.println("main()");

        Example2 obj = new Example2();
        obj.m1();

        class InnerClass{
            public void m2(){
                System.out.println("non-static m2() method");
                System.out.println(str);
            }
        }
        InnerClass obj1 = new InnerClass();
        obj1.m2();
    }
}
