package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;

public class Camera {
    private String type;
    private int mp;
    private double focus;
    private String lense;
    private String features;
    private String video;

    public Camera(String type, int mp, double focus, String lense, String features, String video) {
        super();
        this.type = type;
        this.mp = mp;
        this.focus = focus;
        this.lense = lense;
        this.features = features;
        this.video = video;
    }

    public void getCameraInfo() {
        System.out.println("\n **** CAMERA ****");
        System.out.println("Type : " + type);
        System.out.println("Mega Pixel : " + mp);
        System.out.println("Focus : " + focus);
        System.out.println("lense : " + lense);
        System.out.println("Features : " + features);
        System.out.println("Video : " + video);
    }
}
