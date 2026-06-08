package Non_StaticMember;

/* if we want to access a data  member or a member function from non-static inner class inside
*  non-static method we need to instantiate the inner class */
public class Example4 {
    public static void main(String[] args){
        System.out.println("main()");
        new Example4().m1();
    }
    public void m1(){
        System.out.println("m1() non-static");
        DemoExample obj = new DemoExample();
        obj.m2();
        System.out.println(obj.a);
    }
    class DemoExample{
        int a = 123;
        public static void m2(){
            System.out.println("hello from inner class DemoExample");
        }
    }
}
