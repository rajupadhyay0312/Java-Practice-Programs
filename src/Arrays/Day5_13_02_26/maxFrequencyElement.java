package Arrays.Day5_13_02_26;

import java.util.Arrays;
public class maxFrequencyElement {
    public static void main(String[] args) {
        int [] arr = {5,4,6,3,4,3,5,4,6,2,2,7,4,8};
        boolean [] b = new boolean[arr.length];
        System.out.println(Arrays.toString(arr));
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int eleMax1 = 0;
        int eleMax2 = 0;
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
            if(max1<cnt){
                max2=max1;
                max1 = cnt;
                eleMax2=eleMax1;
                eleMax1=arr[i];
            }else if(max2<cnt && max1!=cnt){
                max2=cnt;
                eleMax2=arr[i];
            }
        }
        System.out.println("max1 ele :"+eleMax1);
        System.out.println("Count : "+max1);
        System.out.println("max2 ele : "+eleMax2);
        System.out.println("count : "+max2);
    }
}
