package Non_StaticMember;

/* We can access static and non-static member of a same class inside a non-static block
 without any reference or object creation.*/

public class Example10 {
    static String str1 =  "Static var";
    static String str2 = "non-static var";

    {
      System.out.println("non-static block");
      System.out.println(str2);
      m2();
      System.out.println(str1);
      m1();
    }
    public static void m1(){
        System.out.println("Static method m1()");
    }
    public void m2(){
        System.out.println("non-static method m2()");
    }
}
class DriverExample11{
    public static void main(String[] args){
        new Example10();
    }
}
