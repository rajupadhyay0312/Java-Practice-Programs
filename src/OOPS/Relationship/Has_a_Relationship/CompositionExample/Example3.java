package OOPS.Relationship.Has_a_Relationship.CompositionExample;

class Engine3 {
    String engineType;

    public Engine3(String engineType) {
        this.engineType = engineType;
    }
    public void engineStart(){
        System.out.println("Type : "+this.engineType);
        System.out.println("ENGINE START");
    }
}
class Car3 {
    String carName;
    private Engine3 engine;

    public Car3(String carName, Engine3 engine) {
        this.carName = carName;
        this.engine = engine; // car receive engine from outside : - Dependency Injection
    }
    public void drive(){
        engine.engineStart();
        System.out.println("Driving Start");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Engine3 engine1 = new Engine3("Petrol engine");
        Engine3 engine2 = new Engine3("Diesel Engine");
        Engine3 engine3 = new Engine3("Electric engine");

        Car3 car1 = new Car3("TATA NEXON",engine1); //Dependency injection :- Taking the engine fron outside
        car1.drive();

        Car3 car2 = new Car3("TATA NEXON",engine2);
        car2.drive();

        Car3 car3 = new Car3("TATA NEXON", engine3);
        car3.drive();

    }
}
