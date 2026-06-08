package Arrays.Day4_12_02_26;

import java.util.Arrays;
import java.util.Scanner;

public class MoveElementGreaterThan_K_to_Right {
    public static void main(String[] args) {
        int[] arr = {1,2,9,10,6,7,8};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=k){
                int temp = arr[i];
                int j=i;
                for(;j>0;j--){
                    if(arr[j-1]>=k){
                        arr[j]=arr[j-1];
                    }else{
                        arr[j] = temp;
                        break;
                    }
                }
                if(j==0) arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
