package Collection_FrameWork.Constructor_Of_Vector;

import java.util.Vector;

public class Constructor_2_InitialCapacity {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(10);
        for(int i=1;i<=20; i++)
            v.add(i);
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
