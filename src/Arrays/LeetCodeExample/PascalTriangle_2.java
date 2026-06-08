package Arrays.LeetCodeExample;

import java.util.ArrayList;
import java.util.List;
public class PascalTriangle_2 {
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> result = getRow(rowIndex);
        System.out.println(result);
    }
    public static List<Integer> getRow(int rowIndex){
        rowIndex++;
        int [][] a =  new int[rowIndex][];
        for(int i=1;i<=rowIndex; i++){
            a[i-1]=new int[i];
        }
        for(int i=0; i<a.length; i++){
            for(int j=0;j<a[i].length; j++){
                a[i][j]=1;
            }
        }
        for(int i=1;i<rowIndex-1; i++){
            for(int j=0; j<a[i].length-1;j++){
                a[i+1][j+1] = a[i][j]+a[i][j+1];
            }
        }
        List<Integer> List = new ArrayList<>();
        for(int j=0;j<a[rowIndex-1].length; j++){
            List.add(a[rowIndex-1][j]);
        }
        return List;
    }
}
