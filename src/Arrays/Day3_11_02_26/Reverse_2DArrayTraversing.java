package Arrays.Day3_11_02_26;

public class Reverse_2DArrayTraversing {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
