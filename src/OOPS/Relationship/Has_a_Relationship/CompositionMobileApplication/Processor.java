package OOPS.Relationship.Has_a_Relationship.CompositionMobileApplication;

public class Processor {
    private OperatingSystem os =
            new OperatingSystem("Android", "Tiramisu", "13",
                    "August 15, 2022", "One UI 8");
    private String chipSet;
    private String cpu;
    private String gpu;

    public Processor(String chipSet, String cpu, String gpu) {
        this.chipSet = chipSet;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public void getProcessor() {
        System.out.println("\n ***** PROCESSOR INFO *******");
        System.out.println("ChipSet : " + chipSet);
        System.out.println("CPU : " + cpu);
        System.out.println("GPU : " + gpu);
        os.getOperatingSystemInfo();
    }
}
