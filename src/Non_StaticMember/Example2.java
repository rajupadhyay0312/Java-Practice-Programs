package Non_StaticMember;

/* we can access static member of same class without any reference inside a non-static  method.
*  but to access members from static inner class we need to use inner class name as a reference*/
public class Example2 {
    static int a = 123;
    public static void m1(){
        System.out.println("m1() static ");
    }
    public static void main(String[] args){
        System.out.println("main()");
        new Example2().m3();
    }
    static class Example3{
        static int b = 20;
        public static void m2(){
            System.out.println("m2() static ");
        }
    }
    public void m3(){
        System.out.println("m3() non static ");
        System.out.println(a);
        m1();
        System.out.println(Example3.b);
        Example3.m2();
    }
}
