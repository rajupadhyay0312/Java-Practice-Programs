package Constructor.super_keyword;

//we can also use super keyword to invoke parent class overridden method when there is method overriding....
class Parent1{
    public void greeting(){
        System.out.println("GOOD MORNING");
    }
}
class Child1 extends Parent1{
    @Override
    public void greeting(){
       super.greeting();
        System.out.println("GOOD AFTERNOON");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.greeting();
    }
}
