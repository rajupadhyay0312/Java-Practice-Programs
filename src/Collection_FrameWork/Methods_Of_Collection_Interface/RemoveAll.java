package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class RemoveAll {
    public static void main(String[] args) {
        Collection col1 = new HashSet();
        col1.add(10);
        col1.add(20);
        col1.add(30);
        System.out.println("col1: "+col1);

        Collection col2 = new ArrayList();
        col2.add(20);
        col2.add(40);
        System.out.println("col2: "+col2);

        System.out.println(col1.removeAll(col2));
        System.out.println("After removeAll: "+col1);

    }
}
