package Non_StaticMember;

/* we can access parent class non-static method using child object with the help of inheritance */
public class SuperClass {
    public void m1(){
        System.out.println("m1() super class");
    }
}
class SubClass extends SuperClass{
    public void m2(){
        System.out.println("m2() subclass");
    }
}
class ExampleDriver1{
    public static void main(String[] args){
        SubClass obj = new SubClass();
        obj.m2();
        obj.m1();
    }
}
