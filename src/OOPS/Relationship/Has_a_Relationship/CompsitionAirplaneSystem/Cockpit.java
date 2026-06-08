package OOPS.Relationship.Has_a_Relationship.CompsitionAirplaneSystem;

public class Cockpit {
    private String pilotName;
    private String controlSystem;
    private String navigationMode;
    private String dashStatus;

    public Cockpit(String pilotName, String controlSystem, String navigationMode, String dashStatus) {
        this.pilotName = pilotName;
        this.controlSystem = controlSystem;
        this.navigationMode = navigationMode;
        this.dashStatus = dashStatus;
    }
    public void getCockpitDetail(){
        System.out.println("\n *** COCKPIT DETAILS ***");
        System.out.println("PilotName : "+pilotName);
        System.out.println("Control System : "+controlSystem);
        System.out.println("Navigation Mode : "+navigationMode);
        System.out.println("Dashboard Status : "+dashStatus);
    }
}
