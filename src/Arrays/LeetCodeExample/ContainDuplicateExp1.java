package Arrays.LeetCodeExample;

import java.util.Arrays;

public class ContainDuplicateExp1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        System.out.println(Arrays.toString(nums));
        System.out.println(majorityElement(nums));
    }
    public static boolean majorityElement(int[] arr) {
        boolean[] b = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt =1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            if(cnt>1) return true;
        }
        return false;
    }
}
