package StaticMember.StaticVariable;

/* we can access a static variable outside a class inside a static member using  class name as a reference */
public class Example4 {
    static String str = "Static variable";
    public static void main(String[] args){
        System.out.println("main "+str);
        m4();
        Example12.m1();
        Example21.m3();

    }
    public static void m4(){
        System.out.println("m4() Example4: "+ Example4.str);
    }
}
class  Example12{
    public static void m1(){
        System.out.println("m1() Example12 : "+ Example4.str);
    }
}
class Example21{
   public static void m3(){
       System.out.println("m3() Example2 : " + Example4.str);
   }
}
