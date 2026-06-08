package Non_StaticMember;

/* we can use this/super keyword only inside a non-static context.
*  we can not access them inside a static context. */
public class Example7 {
    String str = "parent var";
}
class ExampleDriver2 extends Example7{
    String str = "child var";
    public static void main(String[] args){
        System.out.println("main()");
        new ExampleDriver2().m1();
    }
    public void m1(){
        System.out.println("m1() non-static method");
        String str = "Local var";
        System.out.println(str);
        System.out.println(this.str);
        System.out.println(super.str);
    }
}
