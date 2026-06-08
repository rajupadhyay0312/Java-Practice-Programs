package Collection_FrameWork;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class List_methodExp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(22);
        list.add(30);
        list.add(43);
        list.add(1,50);
        System.out.println("Add(int index, E ele): "+list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(60);
        list1.add(70);
        list1.add(56);
        list.addAll(0,list1);
        System.out.println("addAll(int index, collection c): "+list);

        list.remove(1);
        System.out.println("remove(int index): "+list);

        System.out.println("get(int index): "+list1.get(1));

        list1.set(2,80);
        System.out.println("set(int index, E ele): "+list1);

        System.out.println("indexOf(Object obj): "+list.indexOf(30));

        System.out.println("lastIndexOf(Object obj): "+list.lastIndexOf(30));

        System.out.println("subList(int form, int to): "+list.subList(2,3));

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(10);
        l2.add(12);
        l2.add(23);
        l2.addFirst(25);
        l2.addLast(44);
        System.out.println(l2);

        System.out.println("getFirst(): "+l2.getFirst());
        System.out.println("getLast(): "+l2.getLast());
        System.out.println("removeFirst(): "+l2.removeFirst());
        System.out.println("removeLast(): "+l2.removeFirst());

        System.out.println("reversed(): "+l2.reversed());
    }
}
