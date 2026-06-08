package OOPS.Abstraction;

abstract class A {
    public abstract void m1();
}

abstract class B extends A {
}

class D extends B {
    @Override
    public void m1() {
        System.out.println("m1() from D");
    }
}

abstract class E extends B {
}

class F extends E {
    @Override
    public void m1() {
        System.out.println("m1() from F");
    }
}

class C extends A {
    @Override
    public void m1() {
        System.out.println("m1() from C");
    }
}

abstract class G extends C {
}

class H extends G {
    @Override
    public void m1() {
        System.out.println("m1() from H");
    }
}

class I extends G {
    @Override
    public void m1() {
        System.out.println("m1() from I");
    }
}

public class Example4 {
    public static void main(String[] args) {
        I obj = new I();
        obj.m1();
    }
}
