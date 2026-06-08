package Arrays.Day5_13_02_26;

import java.util.Arrays;
public class FindTwoElementThatAppearsOnlyOnce {
    public static void main(String[] args) {
        int[] arr ={4,6,1,5,6,1};
        boolean[] b = new boolean[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            if (cnt == 1)
                System.out.print(arr[i] + " ");
        }
    }
}
