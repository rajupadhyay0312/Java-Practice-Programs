package OOPS.InnerClass;

class Demo21{
    static String a ="static var";
    String b ="non -static var";

    public void m1(){
        System.out.println(a);
        Demo21 obj = new Demo21();
        System.out.println(obj.b);

        class LocalInnerClass {
            static String c="Local Inner Class static var";
            String d = "Local inner class non-static var";

            public void m2(){
                System.out.println("m2() from LocalInnerClass");
            }
            public static void m3(){
                System.out.println("m3() from LocalInnerClass");
            }
        }
        System.out.println(LocalInnerClass.c);
        LocalInnerClass.m3();
        new LocalInnerClass().m2();
    }
}
public class Local_InnerClass {
    public static void main(String[] args) {
        new Demo21().m1();
    }
}
