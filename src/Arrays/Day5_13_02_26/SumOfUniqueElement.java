package Arrays.Day5_13_02_26;

import java.util.Arrays;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 6, 7, 8, 2, 4, 8, 11};
        boolean[] b = new boolean[arr.length];
        int sum = 0;
        System.out.println("Original Array : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            if (cnt == 1){
                System.out.print(arr[i]+" ");
                sum += arr[i];
            }
        }
        System.out.println("\nsum: "+sum);
    }

}
