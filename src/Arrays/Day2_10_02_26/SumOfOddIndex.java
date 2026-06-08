package Arrays.Day2_10_02_26;
import java.util.*;
public class SumOfOddIndex {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int sum =0;
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
           if(i%2!=0)
               sum+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("sum of Odd index : "+sum);

    }
}
