package OOPS.Relationship.Has_a_Relationship.CompsitionAirplaneSystem;

public class Wing {
    private double wingspan;
    private String material;
    private String wingType;
    private int  liftCapacity;

    public Wing(double wingspan, String material, String wingType, int  liftCapacity) {
        this.wingspan = wingspan;
        this.material = material;
        this.wingType = wingType;
        this.liftCapacity = liftCapacity;
    }
    public void getWingDetails(){
        System.out.println("\n **** WING DETAILS ***");
        System.out.println("WingSpan : "+wingspan+" Meter");
        System.out.println("Material : "+material);
        System.out.println("Wing Type : "+wingType);
        System.out.println("Lift Capacity : "+liftCapacity+" Newton");
    }
}
