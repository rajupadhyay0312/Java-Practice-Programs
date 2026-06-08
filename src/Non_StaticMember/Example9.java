package Non_StaticMember;

// Multiple non-static block will be merged into one and gets executes everytime when we create an object...
public class Example9 {
    static int a = 10;
    int b = 20;
    static{
        System.out.println("static block");
        System.out.println(a);
    }
    {
        System.out.println("non-static block 1");
        System.out.println(b);
    }
    Example9(){
        System.out.println("Constructor");
    }
    public void m1(){
        System.out.println("m1() non-static method");
    }
    {
        System.out.println("non-static block2");
    }
}
class DriverExample14{
    public static void main(String[] args){
        Example9 obj1 = new Example9();
        obj1.m1();

        Example9 obj2 = new Example9();
        obj2.m1();
    }
}
