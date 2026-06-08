package Collection_FrameWork.Cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=10; i++)
            list.add(i);
        System.out.println(list);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext())
            if(!(isPrime(it.next())))
                it.remove();

        System.out.println(list);

    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i<num; i++)
            if(num%i==0) return false;
        return true;
    }
}
