package Constructor.super_keyword;

//super keyword is used to invoke the parent class member
class Ramesh{
    String str = "HELLO JAVA";
    public void m1(){
        System.out.println("m1() from parent class");
    }
}
class Suresh extends Ramesh{
    String str = "HELLO WORLD";
    public void m1(){
        System.out.println("m1() from child class");
    }
    public void m2(){
        super.m1();
        System.out.println("m2() from child class");
        System.out.println(str);
        System.out.println(super.str);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Suresh obj = new Suresh();
        obj.m2();
        obj.m1();
    }
}
