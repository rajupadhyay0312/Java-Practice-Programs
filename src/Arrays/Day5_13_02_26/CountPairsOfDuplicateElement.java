package Arrays.Day5_13_02_26;

import java.util.Arrays;
public class CountPairsOfDuplicateElement {
    public static void main(String[] args) {
        int [] arr = {5,4,6,3,4,3,5,4,6,2,2,7,4,8};
        boolean [] b = new boolean[arr.length];
        int totalPair = 0;
        System.out.println("Original Array: "+ Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            if(b[i])continue;
            int cnt=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    b[j]=true;
                }
            }
           totalPair+=cnt/2;
        }
        System.out.println("Count of duplicate pair: "+totalPair);
    }
}
