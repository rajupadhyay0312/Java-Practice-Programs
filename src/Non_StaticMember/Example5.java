package Non_StaticMember;

/* if we want to access non-static member inside non-static method of a different class we need to
     create an object to access them*/
public class Example5 {
    String str = "non static var";
    public void m2(){
        System.out.println("m2() example class");
    }
}
class DriverExample123{
    public static void main(String[] args){
        System.out.println("main");
        m1();
    }
    public static void m1(){
        System.out.println("m1() Driver Example2 class");
        Example5 obj = new Example5();
            System.out.println(obj.str);
            obj.m2();
    }
}
