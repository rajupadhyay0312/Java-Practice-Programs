package Arrays.LeetCodeExample;

import java.util.Arrays;

public class MajorityOfElement {
    public static void main(String[] args) {
        int[] nums = {6,5,5};
        System.out.println(Arrays.toString(nums));
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] arr) {
        boolean[] b = new boolean[arr.length];
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            if(cnt>arr.length/2) return arr[i];
        }
        return -1;
    }
}