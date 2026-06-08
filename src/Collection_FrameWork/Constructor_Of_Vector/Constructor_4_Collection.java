package Collection_FrameWork.Constructor_Of_Vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Constructor_4_Collection {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=1;i<=10; i++)
            v.add(i);
        System.out.println("Vector: "+v);

        ArrayList<Integer> al = new ArrayList<>(v);
        System.out.println("ArrayList: "+al);

        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=10; i++)
            list.add(i);
        System.out.println("LinkedList: "+list);

        PriorityQueue p = new PriorityQueue();
        for(int i=1000; i<=10000; i++)
            p.add(i);
        System.out.println("PriorityQueue: "+p);

        Vector<Integer> v1 = new Vector<>(al);
        Vector<Integer> v2 = new Vector<>(list);
        Vector<Integer> v3 = new Vector<>(p);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
}
