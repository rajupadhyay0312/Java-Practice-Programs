package OOPS.Interface;

interface Vehicle{
    default void start(){
        checkEngine();
        System.out.println("Starting vehicle");
    }
    default void stop(){
        checkEngine();
        System.out.println("Stopping vehicle");
    }
    private void checkEngine(){
        System.out.println("Checking engine....");
    }
}
class Car implements Vehicle{ }
public class PrivateMethod_Inside_InterfaceExp {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        obj.stop();
    }
}
