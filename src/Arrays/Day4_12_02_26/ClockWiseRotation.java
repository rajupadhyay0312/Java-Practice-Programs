package Arrays.Day4_12_02_26;

import java.util.Arrays;
import java.util.Scanner;

public class ClockWiseRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rotation : ");
        int rotation = sc.nextInt();

        for(int j=1; j<=rotation; j++){
            int temp = arr[arr.length-1];
            for(int i=arr.length-2; i>=0; i--){
                arr[i+1] =arr[i];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
