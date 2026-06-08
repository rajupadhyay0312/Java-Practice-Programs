package Collection_FrameWork.CollectionsClass;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Rotate_MethodExp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Collections.rotate(list,2);
        System.out.println(list);
    }
}
