package OOPS.Relationship.Has_a_Relationship.CompsitionAirplaneSystem;

public class DriverExampleAirplane {
    public static void main(String[] args) {
       Cockpit cockpit = new Cockpit("Ramesh Kumar","Side-Stick","AutoPilot","operational");
       Airplane airplane = new Airplane(" Airbus A320","Indigo Airlines",890,180,cockpit);
       airplane.getAirplane();

    }
}
