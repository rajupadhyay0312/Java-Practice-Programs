package OOPS.Polymorphism.Method_Overloading;

class FindLargest{
    public static int findLargest(int num1, int num2){
        return (int)findLargest((double)num1, num2);
    }
    public static double findLargest(double num1, double num2){
        return num1>num2?num1:num2;
    }
    public static int findLargest(int num1, int num2, int num3){
        return (int)findLargest((double)num1, num2,num3);
    }
    public static double findLargest(double num1, double num2, double num3){
        return num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
    }
}
public class Example1 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 2;
        int num3 = 65;

        int max1 = FindLargest.findLargest(num1, num2);
        System.out.println(max1);

        int max2 = FindLargest.findLargest(num1,num2,num3);
        System.out.println(max2);

        double num4 = 12.3;
        double num5 = 3423;
        double num6 = 234.234;
        double max3 = FindLargest.findLargest(num4, num5);
        System.out.println(max3);
        double max4 = FindLargest.findLargest(num4,num5,num6);

    }
}
