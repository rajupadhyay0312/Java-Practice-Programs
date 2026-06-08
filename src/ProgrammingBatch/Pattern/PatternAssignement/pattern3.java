package ProgrammingBatch.Pattern.PatternAssignement;

public class pattern3 {
    public static void main(String[] args){
        int n = 7;
        //outer loop
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<n-1-i){
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}
