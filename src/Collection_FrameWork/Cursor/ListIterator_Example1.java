package Collection_FrameWork.Cursor;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=10; i<=50; i+=10)
            list.add(i);

        System.out.println("Original List: "+list);

        ListIterator<Integer> li = list.listIterator();

        //forward traversal
        System.out.println("\nForward");
        while(li.hasNext())
            System.out.println(li.next());

        //Backward
        System.out.println("\nBackward");
        while(li.hasPrevious())
            System.out.println(li.previous());
    }
}
