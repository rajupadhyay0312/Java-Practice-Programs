package Constructor.This_Call;

//It is primarily used in method and constructor to refer the instance of class
public class Example1 {
    public static void main(String[] args){
        Example1 obj1 = new Example1();
        System.out.println(obj1);
        obj1.m1();

        Example1 obj2 = new Example1();
        System.out.println(obj2);
        obj2.m1();
    }
    public void m1(){
        System.out.println("m1()");
        System.out.println(this);
    }
}
