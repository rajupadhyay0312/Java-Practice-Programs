package OOPS.Abstraction;
abstract class Parent1{
    public abstract void m1();
    public abstract void m2();
}
abstract class ChildA extends Parent1{
    public void m1(){
        System.out.println("m1() from childA");
    }
    public abstract void m3();
}
abstract class GrandChildA extends ChildA{
    public void m4(){
        System.out.println("m4() from GrandChildA");
    }
}
class GreatGrandChild extends GrandChildA{
    public void m2(){
        System.out.println("m2() from GreatGrandChild");
    }
    public void m3(){
        System.out.println("m3() from GreatGrandChild");
    }
}
abstract class ChildB extends Parent1{
    public void m1(){
        System.out.println("m1() from ChildB");
    }
    public void m2(){
        System.out.println("M2() from childB");
    }
}
class GrandChildB extends ChildB{
    public void m3(){
        System.out.println("m3() from GrandChildB");
    }
}
public class Example5 {
    public static void main(String[] args) {
        GreatGrandChild obj = new GreatGrandChild();
        obj.m2();
    }
}
