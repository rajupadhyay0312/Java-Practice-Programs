package StaticMember.StaticImport;

/* If two classes contains static members with same name and both are statically imported it will
   create an ambiguity which will load to compile time error*/
public class Example2 {
    public static void main(String[] args){
        System.out.println("main");
//        m1();
//        m1();
        Demo3.m1();
        Demo4.m1();
    }
}
class Demo3{
    public static void m1(){
        System.out.println("m1() from demo3 class");
    }
}
class Demo4{
    public static void m1(){
        System.out.println("m1() from demo4 class");
    }
}
