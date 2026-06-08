package Collection_FrameWork.Methods_Of_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class ToArray_Method {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        Collection coll = new ArrayList();
        coll.add(10);
        coll.add(20);
        coll.add(30);
        coll.add(40);
        Object[] arr = coll.toArray();
        int [] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i] =(Integer) arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
