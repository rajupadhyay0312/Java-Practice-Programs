package Arrays.Day3_11_02_26;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_newElement_AnyWhere_InArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to insert: ");
        int newEle = sc.nextInt();
        System.out.print("Enter index where you want to insert: ");
        int index = sc.nextInt();

        int[] newArr = new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
        if(index<=newArr.length){
            newArr[index++] = newEle;
        }else{
            System.out.println("Invalid Index!Please Enter valid index");
             return;
        }

        for(int i=index;i<arr.length; i++){
            newArr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
