package OOPS.InnerClass;

class OuterClass1 {

    static String a = "Outer class static var";
    String b = "Outer class non-static var";

    OuterClass1() {
        System.out.println("OuterClass constructor");
    }
    class InnerClass {

        String c = "Inner class non-static var";

        InnerClass() {
            System.out.println("InnerClass constructor");
        }

        public void m1() {
            System.out.println(a);   // static outer member
            System.out.println(b);   // non-static outer member
            System.out.println("m1() from non-static inner class");
        }
    }

    public static void m3() {
        System.out.println("m3() static from OuterClass");
    }

    public void m4() {
        System.out.println("m4() non-static from OuterClass");
    }
}
public class Non_Static_InnerClass {
    public static void main(String[] args) {
        System.out.println(OuterClass1.a);
        OuterClass1.m3();
        OuterClass1 obj = new OuterClass1();
        obj.m4();
        System.out.println(obj.b);

        System.out.println("-----------------------");

        OuterClass1.InnerClass obj1 = obj.new InnerClass();
        System.out.println(obj1.c);
        obj1.m1();
    }
}
