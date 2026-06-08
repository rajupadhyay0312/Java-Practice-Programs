package OOPS.Polymorphism.Method_Shadowing;

class MyThread extends Thread{
    public static void sleep(long ms) throws InterruptedException {
        System.out.println("Hello from sleep() MyThread class");
    }
}
public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Thread obj = new MyThread();//Upcasting
        System.out.println("Main Start");
        obj.sleep(1000);
        System.out.println("Main ends");

        MyThread obj1 = new MyThread();
        obj1.sleep(1000);
    }
}
