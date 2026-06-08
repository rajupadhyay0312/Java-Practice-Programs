package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;

public class Battery {
    private String type;
    private double capacity;
    private String charging;
    private String chargeDuration;
    private double batteryHealth;

    public Battery(String type, double capacity, String charging, String chargeDuration, double batteryHealth) {
        this.type = type;
        this.capacity = capacity;
        this.charging = charging;
        this.chargeDuration = chargeDuration;
        this.batteryHealth = batteryHealth;
    }

    public void getBattery() {
        System.out.println("\n ***** BATTERY *****");
        System.out.println("Type : " + type);
        System.out.println("Capacity : " + capacity);
        System.out.println("Charging : " + charging);
        System.out.println("Charge Duration : " + chargeDuration);
        System.out.println("Battery Health : " + batteryHealth);
    }
}
