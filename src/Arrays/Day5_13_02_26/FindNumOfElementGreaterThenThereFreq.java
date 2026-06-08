package Arrays.Day5_13_02_26;

import java.util.Arrays;
public class FindNumOfElementGreaterThenThereFreq {
    public static void main(String[] args) {
        int [] arr = {5, 7, 1, 2, 5, 9, 2, 4, 7,5,7};
        System.out.println(Arrays.toString(arr));
        boolean[] b = new boolean[arr.length];
        int totalCnt = 0;
        for(int i=0; i<arr.length; i++){
            if(b[i]) continue;
            int cnt=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                   b[j] = true;
                }
            }
            System.out.println(arr[i]+" : "+cnt);
            if(arr[i]>cnt){
                totalCnt++;
            }
        }
        System.out.println("Number of element greater then there frequency:- "+totalCnt);
    }
}
