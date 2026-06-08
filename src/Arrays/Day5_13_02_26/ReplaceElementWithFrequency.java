package Arrays.Day5_13_02_26;

import java.util.Arrays;
public class ReplaceElementWithFrequency {
    public static void main(String[] args) {
        int [] arr = {5,4,6,3,4,3,5,4,6,2,2,7,4,8};
        System.out.println("Original Array: "+Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            int cnt=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            arr[i]=cnt;
        }
        System.out.println("Replace Element: "+Arrays.toString(arr));
    }
}
