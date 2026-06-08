package OOPS.Relationship.Has_a_Relationship.CompsitionAirplaneSystem;

public class Engine {
    private int  horsePower;
    private String fuelType;
    private String engineNum;
    private Double temperature;

    public Engine(int  horsePower, String fuelType, String engineNum, double temperature) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.engineNum = engineNum;
        this.temperature = temperature;
    }
    public void getEngineDetail(){
        System.out.println("\n *** ENGINE DETAILS ***");
        System.out.println("HorsePower : "+horsePower+" HP");
        System.out.println("FuelType :"+fuelType);
        System.out.println("Engine Number : "+engineNum);
        System.out.println("Temperature : "+temperature+" °C");
    }
}
