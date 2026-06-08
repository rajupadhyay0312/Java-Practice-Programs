package OOPS.Abstraction;

abstract class UserMath {
    public abstract int max(int num1, int num2);

    public abstract double max(double num1, double num2);

    public abstract int max(int num1, int num2, int num3);

    public abstract double max(double num1, double num2, double num3);

    public abstract int min(int num1, int num2);

    public abstract double min(double num1, double num2);

    public abstract int min(int num1, int num2, int num3);

    public abstract double min(double num1, double num2, double num3);

    public abstract double pow(double num, double power);

    public abstract int abs(int num);
}

class SubClass extends UserMath {
    @Override
    public int max(int num1, int num2) {
        return (int) max((double) num1, num2);
    }

    @Override
    public double max(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }

    @Override
    public int max(int num1, int num2, int num3) {
        return (int) max((double) num1, num2, num3);
    }

    @Override
    public double max(double a, double b, double c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    @Override
    public int min(int num1, int num2) {
        return (int) min((double) num1, num2);
    }

    @Override
    public int min(int a, int b, int c) {
        return (int) min((double) a, b, c);
    }

    @Override
    public double min(double num1, double num2) {
        return num1 < num2 ? num1 : num2;
    }

    @Override
    public double min(double a, double b, double c) {
        return a < b ? (a < c ? a : c) : (b < c ? b : c);
    }

    @Override
    public int abs(int num) {
        return num < 0 ? num * -1 : num;
    }

    @Override
    public double pow(double num, double power) {
        double p = 1;
        if (power < 0) {
            num = 1.0 / num;
            power *= -1;
        }
        for (int i = 1; i <= power; i++) {
            p *= num;
        }
        return p;
    }
}

public class Example1 {
    public static void main(String[] args) {
        UserMath obj = new SubClass();
        System.out.println(obj.max(23, 45));
        System.out.println(obj.max(23, 45, 67));
        System.out.println(obj.max(23.44, 78.9));
        System.out.println(obj.max(34.4, 56.7, 12.3));
        System.out.println(obj.min(67, 98, 100));
        System.out.println(obj.min(12.3, 89.34));
        System.out.println(obj.min(1, 2));
        System.out.println(obj.min(23.45,78.34,76.45));
        System.out.println(obj.pow(2, 3));
        System.out.println(obj.abs(-10));


    }
}
