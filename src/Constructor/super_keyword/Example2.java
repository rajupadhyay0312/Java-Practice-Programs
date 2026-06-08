package Constructor.super_keyword;

//super keyword is used to differentiate parent class and child class variable if they contain same name....
class Parent{
    String str = "PARENT VAR";
}
class Child extends Parent{
    String str = "CHILD VAR";
    public void m1(){
        System.out.println("m1() from child class");
        System.out.println(str);
        System.out.println(super.str);
    }
}
public class Example2 {
    public static void main(String[] args) {
        new Child().m1();
    }
}
