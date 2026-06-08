package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class containsAll_Method {
    public static void main(String[] args) {
            Collection col1 = new ArrayList();
            col1.add(10);
            col1.add(20);
            col1.add(30);

            Collection col2 = new ArrayList();
            col2.add(10);
            col2.add(20);

            System.out.println(col1.containsAll(col2));
        }
}
