package StaticMember.StaticMethod;

/* we cannot access a non-static members inside a static context
   without creating object */

public class Example4 {
    String str = "non-static var";
    {
        System.out.println("Non-static block");
    }
    Example4(){
        System.out.println("Example4 constructor ");
    }
    public void m1(){
        System.out.println("non-static m1()");
    }
    public static void m2(){
        System.out.println("Static method m2()");

        Example4 obj = new Example4();

        // m1(); CTE
        //System.out.println(str); CTE
        obj.m1();
        System.out.println(obj.str);
    }
    public static void main(String[] args){
        m2();
    }
}
