package OOPS.Relationship.Has_a_Relationship.CompsitionAirplaneSystem;

public class Airplane {
    private String airplaneModel;
    private String airlineName;
    private int maxSpeed;
    private int capacity;
    private Engine engine = new Engine(200,"Jet A1 Fuel","ENG-8765",360);
    private Wing wing;
    private Cockpit cockpit;

    public Airplane(String airplaneModel, String airlineName, int maxSpeed, int capacity, Cockpit cockpit) {
        this.airplaneModel = airplaneModel;
        this.airlineName = airlineName;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.wing = new Wing(34.5,"Carbon Fiber","Swept Wing",25000);
        this.cockpit=cockpit;
    }
    public void getAirplane(){
        System.out.println("\n **** AIRPLANE INFO *****");
        System.out.println("Airplane Model :"+airplaneModel);
        System.out.println("Airline Name : "+airlineName);
        System.out.println("Maximum Speed : "+maxSpeed+" km/hr");
        System.out.println("Capacity : "+capacity+" Passenger");
        engine.getEngineDetail();
        wing.getWingDetails();
        cockpit.getCockpitDetail();
    }
}
