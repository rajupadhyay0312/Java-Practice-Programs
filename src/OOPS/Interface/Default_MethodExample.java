package OOPS.Interface;

interface Example123 {
    default void m1() {
        System.out.println("Hello from interface");
    }

    public static void main(String[] args) {
        new Example321().m1();
    }
}

class Example321 implements Example123 {
    @Override
    public void m1(){
        Example123.super.m1();
        System.out.println("impl class override m1()");
    }
}

public class Default_MethodExample {
}
