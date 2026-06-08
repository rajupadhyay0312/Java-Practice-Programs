package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;

public class Size_Method {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.size();
        list.add("Apple");
        list.add("Banana");
        list.size();
        System.out.println(list);

        Collection<String>set = new HashSet<>();
        set.add("cat");
        set.add("Dog");
        set.add("Lion");
        set.size();
        System.out.println(set);

        Collection<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,20,30,40));
        treeSet.size();
        System.out.println(treeSet);

    }
}
