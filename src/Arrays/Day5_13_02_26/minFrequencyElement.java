package Arrays.Day5_13_02_26;

import java.util.Arrays;

public class minFrequencyElement {
    public static void main(String[] args) {
        int [] arr = {5,4,6,3,4,3,5,4,6,2,2,7,4,8};
        boolean [] b = new boolean[arr.length];
        System.out.println(Arrays.toString(arr));
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int eleMin1 = 0;
        int eleMin2 = 0;
        for(int i=0; i<arr.length;i++){
            if(b[i]) continue;
            int cnt = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    b[j]=true;
                }
            }
            System.out.println(arr[i]+" : "+cnt);
            if(min1>cnt){
                min2=min1;
                min1 = cnt;
                eleMin2=eleMin1;
                eleMin1=arr[i];
            }else if(min2>cnt && min1!=cnt){
                min2=cnt;
                eleMin2=arr[i];
            }
        }
        System.out.println("min1 ele :"+eleMin1);
        System.out.println("Count : "+min1);
        System.out.println("min2 ele : "+eleMin2);
        System.out.println("count : "+min2);
    }
}
