package Collection_FrameWork.CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_MethodExp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana","Kiwi","Apple"));
        Collections.sort(list,(a, b)->a.length()-b.length());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
