package OOPS.Polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1 = new LinkedList<>();
        list1 = new Stack<>();

        System.out.println(list1);
        List obj = new ArrayList();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        System.out.println(obj);
        obj.remove(1);
        System.out.println(obj);
    }
}
