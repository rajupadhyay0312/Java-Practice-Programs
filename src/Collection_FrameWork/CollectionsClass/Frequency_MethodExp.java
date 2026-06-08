package Collection_FrameWork.CollectionsClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency_MethodExp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,2,4);
        int count = Collections.frequency(list,2);
        System.out.println(count);
    }
}
