package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Add_Method {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Apple");
        System.out.println(set);

        Collection<Integer> tree = new TreeSet<>();
        tree.add(null);
        System.out.println(tree);
    }
}
