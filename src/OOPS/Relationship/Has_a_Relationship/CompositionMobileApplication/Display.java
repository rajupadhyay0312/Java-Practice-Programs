package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;

public class Display {
    private String type;
    private double size;
    private String resolution;
    private String protection;

    public Display(String type, double size, String resolution, String protection) {
        super();
        this.type = type;
        this.size = size;
        this.resolution = resolution;
        this.protection = protection;
    }
    public void getDisplay(){
        System.out.println("Type : "+type);
        System.out.println("Size : "+size);
        System.out.println("Resolution : "+resolution);
        System.out.println("protection : "+protection);
    }
}
