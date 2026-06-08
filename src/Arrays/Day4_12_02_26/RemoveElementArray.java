package Arrays.Day4_12_02_26;

import java.util.Arrays;
import java.util.Scanner;

class InvalidIndexException extends RuntimeException{
    InvalidIndexException(String desc){
        super(desc);
    }
}
public class RemoveElementArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        if (index < 0 || index >= arr.length)
            throw new InvalidIndexException("Index " + index + " is invalid for length " + arr.length);

        int [] newArr = new int[arr.length-1];
        for(int i=0,j=0; i<arr.length; i++){
            if(index == i)
                continue;
            newArr[j++]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}