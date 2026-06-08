package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class IsEmpty_Method {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.isEmpty();
        list.add("Apple");
        list.clear();
        System.out.println(list);
    }
}
