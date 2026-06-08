package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;

public class OperatingSystem {
    private String name;
    private String versionName;
    private String version;
    private String releaseDate;
    private String ui;

    public OperatingSystem(String name, String versionName, String version, String releaseDate, String ui) {
        super();
        this.name = name;
        this.versionName = versionName;
        this.version = version;
        this.releaseDate = releaseDate;
        this.ui = ui;
    }
    public void  getOperatingSystemInfo(){
        System.out.println("\n *****Operating System ******");
        System.out.println("Name : "+name);
        System.out.println("versionName : "+versionName);
        System.out.println("Version : "+version);
        System.out.println("releaseDate :"+releaseDate);
        System.out.println("UI :"+ui);
    }
}
