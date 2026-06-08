package Method;

import java.util.ArrayList;

public class Hetrogeneous {
    public static void main(String[] args) {
        ArrayList bag = getBagDetails();
        System.out.println();
        System.out.println(bag);
    }

    public static ArrayList getBagDetails() {
        String laptop = "DELL";
        String book = "JAVA";
        int pens = 3;
        String waterBottle = "Milton";
        double money = 1000;

        ArrayList bag = new ArrayList();
        bag.add(laptop);
        bag.add(book);
        bag.add(pens);
        bag.add(waterBottle);
        bag.add(money);

        return bag;
    }
}
