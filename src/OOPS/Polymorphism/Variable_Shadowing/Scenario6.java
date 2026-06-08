package OOPS.Polymorphism.Variable_Shadowing;

//parent class static variable shadowed by child class static variable

class Parent1{
    static String str = "Parent class var";
}
class Child1 extends Parent1{
    static String str = "Child class var";
    public static void m1(){
        System.out.println("m1() static from child class");
        System.out.println(str);
    }
}
public class Scenario6 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.m1();
    }
}
