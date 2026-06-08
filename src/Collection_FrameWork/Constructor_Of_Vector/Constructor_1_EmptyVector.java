package Collection_FrameWork.Constructor_Of_Vector;

import java.util.Vector;

public class Constructor_1_EmptyVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=1; i<=11; i++)
            v.add(i);
        System.out.println(v.capacity()); // initialCapacity * 2 -> (10*2=20)
        System.out.println(v);
    }
}
