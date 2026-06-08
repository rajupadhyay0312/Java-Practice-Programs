package OOPS.Relationship.Has_a_Relationship.CompositionExample;

//Creation inside the constructor of container class
class Engine1{
    String engineType;
    int gears;

    public Engine1(String engineType, int gears) {
        this.engineType = engineType;
        this.gears = gears;
    }
    public void engineStart(){
        System.out.println("ENGINE STARTS");
    }
}
class Car1{
    String carName;
    private Engine1 engine;

    public Car1(String carName,String typeEngine, int gears) {
        this.carName = carName;
        //the container(Car1) class created contained(Engine1) object inside its constructor
        this.engine = new Engine1(typeEngine,gears);
    }
    public void drive(){
        engine.engineStart();
        System.out.println("Driving Start");
    }
}
public class Example2 {
    public static void main(String[] args) {
        //we can pass customized parameter to the contained object
      Car1 car = new Car1("ALTO","CI",5);
      car.drive();
    }
}
