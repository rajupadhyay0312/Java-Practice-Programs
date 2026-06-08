package OOPS.Abstraction;

class Parent{
    public void greet(){
        System.out.println("GOOD MORNING");
    }
}
abstract class Child extends Parent{
    public abstract void greet();
}
class GrandChild extends Child{
    public void greet(){
        System.out.println("GOOD AFTERNOON");
    }
}
public class Example3 {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.greet();
    }
}
