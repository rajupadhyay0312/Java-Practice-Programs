package Collection_FrameWork.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fill_MethodExp {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("Hello");
        list.add(true);
        list.add('A');
        System.out.println(list);
        Collections.fill(list,"Ramesh");
        System.out.println(list);
    }
}
