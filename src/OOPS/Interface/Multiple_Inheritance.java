package OOPS.Interface;

interface InterfaceA {
    void m2();
}

// Interface 2
interface InterfaceB {
    void m3();
}

// Parent class
class Example11 {
    public void m1() {
        System.out.println("m1() implemented by Example11");
    }
}

// Child class
public class Multiple_Inheritance
        extends Example11
        implements InterfaceA, InterfaceB {

    @Override
    public void m2() {
        System.out.println("m2() implemented by child class");
    }

    @Override
    public void m3() {
        System.out.println("m3() implemented by child class");
    }

    public static void main(String[] args) {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.m1(); // from Example11
        obj.m2(); // from InterfaceA
        obj.m3(); // from InterfaceB
    }
}