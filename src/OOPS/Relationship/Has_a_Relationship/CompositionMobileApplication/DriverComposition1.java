package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;


public class DriverComposition1 {
    public static void main(String[] args) {
        Display display = new Display("Dynamic AMOLED 2X, 120Hz", 6.8, "1440 x 3088 pixels", "corning gorilla class victus 2");
        Speaker speaker = new Speaker("kuchtoh", 2, true, false);
        Mobile mobile = new Mobile("Samsung", "S23 Ultra", 120000, "Black", 234, "163.4 x 78.1", display, speaker);
        mobile.getMobile();

//        System.out.println("\n _________SHALLOW COPY ___________");
//        Mobile clone = mobile;
//        clone.getMobile();
    }
}
