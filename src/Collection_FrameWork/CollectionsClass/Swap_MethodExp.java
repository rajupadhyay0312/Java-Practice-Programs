package Collection_FrameWork.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Swap_MethodExp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Collections.swap(list, 0, 2);
        System.out.println(list);
    }
}
