package Arrays.Day3_11_02_26;

import java.util.Arrays;
import java.util.Scanner;
public class InsertNewElement_In_Array {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one ele to inset at end: ");
        int newEle = sc.nextInt();

        int [] newArr = new int[arr.length+1];
        System.out.println(Arrays.toString(newArr));
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
        newArr[newArr.length-1]=newEle;
        System.out.println(Arrays.toString(newArr));
    }
}
