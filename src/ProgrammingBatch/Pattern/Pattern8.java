package ProgrammingBatch.Pattern;

public class Pattern8 {
    public static void main(String[] args){

        int n = 17;
        for(int i= 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j>3*n/4 || j==n-1 && i>3*n/4 || j==n-1 && i<n/4 || i==0 && j<n/4){
                    System.out.print("* "+" ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
