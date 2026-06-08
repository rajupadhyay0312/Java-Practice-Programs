package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;

public class Speaker {
    private String type;
    private int number;
    private boolean stereo;
    private boolean dolbyAtmos;

    public Speaker(String type, int number, boolean stereo, boolean dolbyAtmos) {
        this.type = type;
        this.number = number;
        this.stereo = stereo;
        this.dolbyAtmos = dolbyAtmos;
    }

    public void getSpeaker() {
        System.out.println("\n***** SPEAKER INFO ******");
        System.out.println("Type : " + type);
        System.out.println("Number : " + number);
        System.out.println("Stereo : " + (stereo ? " Yes" : " No"));
        System.out.println("dolbyAtmos : " + (dolbyAtmos ? " Yes" : " No"));
    }
}
