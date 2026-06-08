package Arrays.Day3_11_02_26;

import java.util.Arrays;
public class RandomNumberFrom_1_To_100 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length;) {
            int num = (int) (Math.random() * 100)+1;
            if (num >= 1 && num <= 100) {
                if (!checkNum(num, arr)) {
                    arr[i++] = num;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean checkNum(int num, int[] arr) {
        for (int ele : arr)
            if (num == ele)
                return true;
        return false;
    }
}
