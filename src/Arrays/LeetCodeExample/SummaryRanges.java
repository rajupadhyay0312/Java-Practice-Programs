package Arrays.LeetCodeExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args){
        int [] arr = {0,1,2,4,5,7};
        System.out.println(Arrays.toString(arr));
        List<String> result = summaryRange(arr);
        System.out.println(result);
    }
    public static List<String> summaryRange(int[] arr){
        List<String> list = new ArrayList<>();
        if(arr.length==0) return list;
        int start = arr[0];
        for(int i=0; i<arr.length-1;i++){
            if(arr[i + 1] != arr[i] + 1) {
                if(start==arr[i]){
                    list.add(start+" ");
                }else{
                    list.add(start+"->"+arr[i]);
                }
                start = arr[i+1];
            }
        }
        //Add last range
        //  7==7
        if(start ==arr[arr.length-1]){
            list.add(start+"");//7
        }else{
            list.add(start+"->"+arr[arr.length-1]);
        }
        return list;
    }
}
