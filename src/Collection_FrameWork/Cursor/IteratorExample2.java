package Collection_FrameWork.Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=10; i<=50; i+=10){
            list.add(i);
        }
        System.out.println("Original list: "+list);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer ele = it.next();
            System.out.println(ele);
        }
    }
}
