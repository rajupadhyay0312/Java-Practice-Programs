package OOPS.Interface;

@FunctionalInterface
interface Demo11{
    void m1();
}
class Example21 implements Demo11{
    @Override
    public void m1(){
        System.out.println("m1() impl from Example21");
    }
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        new Example21().m1();
    }
}
