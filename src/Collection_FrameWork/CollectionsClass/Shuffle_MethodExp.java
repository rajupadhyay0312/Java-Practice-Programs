package Collection_FrameWork.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Shuffle_MethodExp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collections.shuffle(list);
        System.out.println(list);
    }
}
