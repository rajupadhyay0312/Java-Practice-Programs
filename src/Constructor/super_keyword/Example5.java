package Constructor.super_keyword;

//Based on the type of argument in super() we can access specific constructor from parent class....
class Parent5{
    Parent5(){
        System.out.println("parent()");
    }
    Parent5(int a){
        System.out.println("parent(int a)");
    }
    Parent5(String a, double b){
        System.out.println("parent(String a, double b)");
    }
}
class Child5 extends Parent5{
    Child5(){
//        super();
//        super(10);
//        super(10L);
//        super((byte)10);
        super("Hello java",10);
        System.out.println("child()");
    }
}
public class Example5 {
    public static void main(String[] args) {
        Child5 obj = new Child5();
    }
}
