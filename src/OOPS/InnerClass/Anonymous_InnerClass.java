package OOPS.InnerClass;

@FunctionalInterface
interface Demo13{
    void m1();
}
public class Anonymous_InnerClass {
    public static void main(String[] args) {
        Demo13 obj = new Demo13() {
            @Override
            public void m1() {
                System.out.println("m1() impl");
            }
        };
        obj.m1();
    }
}
