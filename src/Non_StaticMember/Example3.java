package Non_StaticMember;

/* we can access non-static member of a class inside a non-static method without creating an object */
public class Example3 {
    String str = "non-static var";
    {
        System.out.println("non-static block");
    }
    public static void main(String[] args){
        System.out.println("main()");
        new Example3().m1();
    }
    public void m1(){
        System.out.println("m1() non-static ");
        System.out.println(str);
        m2();
    }
    public void m2(){
        System.out.println("m2() non static");
    }
}
