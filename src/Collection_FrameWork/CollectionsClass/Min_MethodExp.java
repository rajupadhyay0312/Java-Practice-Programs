package Collection_FrameWork.CollectionsClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Min_MethodExp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,20);
        int min  = Collections.min(list);
        System.out.println(min);
    }
}
