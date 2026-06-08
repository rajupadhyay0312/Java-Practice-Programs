package Collection_FrameWork;

import java.util.Vector;
public class Vector_Method {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=1; i<=100; i+=10)
            v.add(i);
        System.out.println("Vector: "+v);
        System.out.println("Capacity: "+v.capacity());
        System.out.println("elementAt: "+v.elementAt(2));
        System.out.println("firstElement: "+v.firstElement());
        System.out.println("lastElement: "+v.lastElement());
        v.setElementAt(10,0);
        System.out.println("After setElement(E ele, int index: "+v);
        v.removeElementAt(2);
        System.out.println("After removeElement: "+v);
        v.insertElementAt(400,1);
        System.out.println("After insertEle: "+v);
        v.addElement(1000);
        System.out.println("After addElem: "+v);

        System.out.println("--------------v2-------------");

        Vector<Integer> v2 = new Vector<>(2);
        System.out.println("InitialCapacity: "+v2.capacity());
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println("Capacity After adding element: "+v2.capacity());
        v2.ensureCapacity(10);
        System.out.println("Capacity After ensureCapacity: "+v2.capacity());
        v2.add(4);
        v2.add(5);
        System.out.println("Capacity after adding more element: "+v2.capacity());
        v2.trimToSize();
        System.out.println("Capacity after trimToSize: "+v2.capacity()
        );
    }
}
