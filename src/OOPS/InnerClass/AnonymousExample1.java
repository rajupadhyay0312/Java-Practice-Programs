package OOPS.InnerClass;

abstract class Demo23{
    public abstract int addition(int num1, int num2);
    public abstract int min(int num1, int num2, int num3);
}
public class AnonymousExample1 {
    public static void main(String[] args) {
        Demo23 obj = new Demo23() {
            @Override
            public int addition(int num1, int num2) {
                return num1+num2;
            }

            @Override
            public int min(int num1, int num2, int num3) {
                return (num1<num2)?((num1<num3)?num1:num3):((num2<num3)?num2:num3);
            }
        };
        System.out.println(obj.addition(10,20));
        System.out.println(obj.min(34,56,23));
    }
}
