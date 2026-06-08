package StaticMember.StaticMethod;

/* If we want to invoke a static method from one class to another we have to use className
 as a reference */
public class StaticMethodExample2 {
    public static void main(String[] args) {
        System.out.println("main() from demo class");
        //m2() // this will throw CTE
        Demo2.m4();
        Demo1.m2();
        Demo1.m3();
        StaticMethodExample2.m1();
    }

    public static void m1() {
        System.out.println("m1() from demo class");
    }
}

class Demo1 {
    public static void m2() {
        System.out.println("m2() from demo1 class");
    }

    public static void m3() {
        System.out.println("m3() fron demo1 class");
    }
}

class Demo2 {
    public static void m4() {
        System.out.println("m4() from demo2 class");
    }
}
