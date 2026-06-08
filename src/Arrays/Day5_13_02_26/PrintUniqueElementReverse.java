package Arrays.Day5_13_02_26;

import java.util.Arrays;

public class PrintUniqueElementReverse {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 6, 7, 8, 2, 4, 8, 11};
        System.out.println("Original Array : " + Arrays.toString(arr));
        for (int i = arr.length-1; i>=0; i--) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if(cnt==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
