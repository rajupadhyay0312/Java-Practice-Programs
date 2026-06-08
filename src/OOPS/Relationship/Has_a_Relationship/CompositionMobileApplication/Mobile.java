package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;

public class Mobile {
    private String brand;
    private String model;
    private double price;
    private String color;
    private double weight;
    private String dimension;
    private Processor processor =
            new Processor("Qualcomm SM8550-AC Snapdragon 8 Gen 2(4 min)", "octa-core", "Adreno 740");
    private Battery battery;
    private Camera mainCamera =
            new Camera("Main camera", 200, 1, "7", "multi-directional PDAF", "Lase AF, LED flash, auto-HDR, panorama,BK@24/30fps");
    private Camera selfieCamera =
            new Camera("Selfie Camera", 12, 2.2, "dual pixel PDAF", "HDR, HDR10+", "4K@30/60fps, 1080p@30fps");
    private Display display;
    private Speaker speaker;

    public Mobile(String brand, String model, double price, String color, double weight, String dimension, Display display, Speaker speaker) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.weight = weight;
        this.dimension = dimension;
        this.battery = new Battery("LI-Ion", 5000, "45w wired", "65% in 30 min", 100);
        this.display = display;
        this.speaker = speaker;
    }

    public void getMobile() {
        System.out.println("\n *** MOBILE INFO *****");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("color : " + color);
        System.out.println("weight : " + weight + "gm");
        System.out.println("dimension : " + dimension);
        processor.getProcessor();
        battery.getBattery();
        mainCamera.getCameraInfo();
        selfieCamera.getCameraInfo();
        display.getDisplay();
        speaker.getSpeaker();

    }
}
