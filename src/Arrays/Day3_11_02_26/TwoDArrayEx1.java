package Arrays.Day3_11_02_26;

import java.util.Arrays;

public class TwoDArrayEx1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        System.out.println(Arrays.deepToString(arr));

        System.out.println("Using for Loop");
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop:-");
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println("Using do-while loop:- ");

        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(arr[i][j] + " ");
                j++;
            } while (j < arr[i].length);
            i++;
            System.out.println();
        } while (i < arr.length);

        System.out.println("For Each loop:- ");
        for(int[] row :arr){
            for(int ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
