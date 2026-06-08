package OOPS.Polymorphism.Method_Overloading;

class AreaCalculation{
    public static double area(double radius){
        final double PI = 22/7.0;
        double area = PI*radius*radius;
        return area;
    }
    public static double area(double length, double breadth){
        double area = length*breadth;
        return area;
    }
    public static double area(float side){
        double area = side*side;
        return area;
    }
}
public class Example2 {
    public static void main(String[] args) {
        double radius = 234.12;
        double circle = AreaCalculation.area(radius);
        System.out.println("Area of circle : "+String.format("%.3f",circle));

        double length = 213;
        double breadth = 234;
        double rectangle = AreaCalculation.area(length, breadth);
        System.out.println("Area of rectangle : "+String.format("%.3f", rectangle));

        float side = 456f;
        double square = AreaCalculation.area(side);
        System.out.println("Area of Square : "+String.format("%.3f ",square));
    }
}
