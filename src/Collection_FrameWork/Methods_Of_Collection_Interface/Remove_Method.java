package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class Remove_Method {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        list.remove("Apple");
        list.remove("Mango");

        System.out.println(list);
    }
}
