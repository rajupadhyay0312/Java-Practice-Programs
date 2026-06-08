package OOPS.InnerClass;

class OuterClass {
    public static String a = "Outer class static var ";
    public String b = "Outer class non-static var";

    public OuterClass() {
        System.out.println("OuterClass constructor");
    }

    public static class InnerClass {
        public static String c = "Inner class static var";
        public String d = "Inner clas non-static var";

        public InnerClass() {
            super();
            System.out.println("InnerClass constructor");
        }

        public static void m1() {
            System.out.println(a);
            System.out.println("m1() static from static inner class");
        }

        public void m2() {
            System.out.println(new OuterClass().b);
            System.out.println("m2() non-static from static inner class");
        }
    }

    public static void m3() {
        System.out.println("m3() static from OuterClass");
    }

    public void m4() {
        System.out.println("m4() non-static from OuterClass");
    }
}

public class Static_InnerClass {
    public static void main(String[] args) {
        System.out.println(OuterClass.a);
        OuterClass.m3();
        OuterClass obj = new OuterClass();
        obj.m4();
        System.out.println(obj.b);

        System.out.println("-----------------------");

        System.out.println(OuterClass.InnerClass.c);
        OuterClass.InnerClass.m1();
        OuterClass.InnerClass obj1 = new OuterClass.InnerClass();
        obj1.m2();
        //System.out.println(obj1.d);
    }
}
