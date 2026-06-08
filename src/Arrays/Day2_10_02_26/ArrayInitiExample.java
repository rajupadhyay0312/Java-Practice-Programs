package Arrays.Day2_10_02_26;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayInitiExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<size; i++){
            System.out.print("Enter the " +(i+1)+ " element : ");
            int ele = sc.nextInt();
            arr[i]=ele;
        }
        System.out.println(Arrays.toString(arr));
    }
}
