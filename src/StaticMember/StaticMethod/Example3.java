package StaticMember.StaticMethod;

/* we can access a static method inside a non-static context(block) of another
 class with the help of className as a reference*/
public class Example3 {
    public static void main(String[] args){
        System.out.println("main() from demo class");
        new Demo3().m2();
        new Demo4().m3();
    }
    public static void m1(){
        System.out.println("m1() static demo class");
    }
}
class Demo3{
    public void m2(){
        System.out.println("non-static m2() Demo3");
        Example3.m1();
    }
}
class Demo4{
    public void m3(){
        System.out.println("non-static m3() Demo4");
        Example3.m1();
    }
}
