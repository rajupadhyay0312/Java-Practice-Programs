package Arrays.LeetCodeExample;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_1 {
    public static void main(String[] args) {
      int numRows = 5;
      List<List<Integer>> result = generate(numRows);
        System.out.println(result);

    }
    public static List<List<Integer>> generate(int numRows){
        int [][] a = new int[numRows][];
        for(int i=1; i<=numRows; i++){
            a[i-1] = new int[i];
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++){
                a[i][j]=1;
            }
        }
        for(int i=1; i<numRows-1;i++){
            for(int j=0; j<a[i].length-1; j++){
                a[i+1][j+1] = a[i][j]+a[i][j+1];
            }
        }
        List<List<Integer>>List = new ArrayList<>();
        for(int[] arr:a){
            List<Integer>List1 = new ArrayList<>();
            for(int ele : arr){
                List1.add(ele);
            }
            List.add(List1);
        }
        return List;
    }
}
