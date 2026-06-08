package Collection_FrameWork.Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector<Integer> list  = new Vector<>();
        for(int i=10; i<=100; i+=10)
            list.add(i);

        System.out.println(list);

        Enumeration<Integer> en  = list.elements();
        while (en.hasMoreElements()){
           Integer ele = en.nextElement();
            System.out.println(ele);
        }
    }
}
