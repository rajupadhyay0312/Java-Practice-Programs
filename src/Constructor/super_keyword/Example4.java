package Constructor.super_keyword;

//we can avoid a recursive call using super keyword inside an overriding method
class Parent2{
    public void greeting(){
        System.out.println("GOOD MORNING");
    }
}
class Child2 extends Parent{
    public void greeting(){
        greeting();//recursive call
        System.out.println("GOOD AFTERNOON");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.greeting();
    }
}
