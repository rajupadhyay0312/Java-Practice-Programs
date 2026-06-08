package Collection_FrameWork.Constructor_Of_Vector;

import java.util.Vector;

public class Constructor_3_InitialCap_CapacityIncrease {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(10,20);
        System.out.println("Capacity of vector: "+v.capacity());
        for(int i=1; i<=11; i++)
            v.add(i);
        System.out.println("Capacity of vector: "+v.capacity());
        System.out.println(v);
    }
}
