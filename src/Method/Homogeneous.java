package Method;

import java.util.*;

public class Homogeneous {
    public static void main(String[] args) {
        String[] colors = m1();
        System.out.println(Arrays.toString(colors));
    }

    public static String[] m1() {
        String color1 = "RED";
        String color2 = "BLACK";
        String color3 = "BLUE";

        String[] colors = {color1, color2, color3};
        return colors;

    }
}
