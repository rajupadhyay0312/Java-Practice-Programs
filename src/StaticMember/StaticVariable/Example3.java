package StaticMember.StaticVariable;

/* we can access the static variable outside a class inside any non-static members using
   class name as a reference */
public class Example3 {
    static String str = "Static variable";
    public static void main(String[] args){
     Example123 obj = new Example123();
     obj.m1();
    }
}
class Example123{
   static String str = Example3.str;

   Example123(){
       System.out.println("Constructor Example1:"+str);
   }
    {
        System.out.println("non-static block Example1:"+str);
    }
    public void m1(){
       System.out.println("non-static m1() "+str);
    }
}
