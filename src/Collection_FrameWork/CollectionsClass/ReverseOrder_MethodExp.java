package Collection_FrameWork.CollectionsClass;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ReverseOrder_MethodExp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,6,4,1,3);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}

