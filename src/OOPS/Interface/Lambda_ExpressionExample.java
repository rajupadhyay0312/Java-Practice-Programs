package OOPS.Interface;

@FunctionalInterface
interface operation {
    int addition(int num1, int num2);
}

@FunctionalInterface
interface UserMath {
    double square(double num);
}

public class Lambda_ExpressionExample {
    public static void main(String[] args) {
        operation obj = (num1, num2) -> num1 + num2;
        System.out.println(obj.addition(10, 20));
        UserMath obj1 = num -> num * num;
        System.out.println(obj1.square(4));
    }
}
