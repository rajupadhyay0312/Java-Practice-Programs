package OOPS.Relationship.Has_a_Relationship.CompositionExample;

//The contained object is created immediately when the parent(container)object is created

class Engine{
    String engineType;
    Engine(String engineType){
        this.engineType=engineType;
    }
    public void engineStart(){
        System.out.println("ENGINE START");
    }
}
class Car{
    String carName;
    private  Engine engine = new Engine("SI");

    public Car(String carName) {
        this.carName = carName;
    }
    public void drive(){
        engine.engineStart();
        System.out.println("Driving Start");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Car car = new Car("ALTO");
        car.drive();
    }
}
