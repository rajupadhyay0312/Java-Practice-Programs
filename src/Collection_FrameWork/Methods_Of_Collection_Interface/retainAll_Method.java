package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class retainAll_Method {
    public static void main(String[] args) {
        Collection<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("orange");
        list1.add("Apple");

        Collection<String> retainList = Arrays.asList("Apple","Mango");
        list1.retainAll(retainList);
        System.out.println(list1);
    }
}
