package ProgrammingBatch.Pattern.PatternAssignement;

public class NumberPattern3 {
    public static void main(String[] args){
        int n=5, evenDiff=2*n-1, oddDiff=1;
        for(int i=1; i<=n; i++){
            int num = i;
            System.out.print(num+" ");
            for(int j=1; j<n; j++){
                if(j%2==0){
                    num += oddDiff;
                    System.out.print(num+" ");
                }
                else{
                    num += evenDiff;
                    System.out.print(num+" ");
                }
            }
            evenDiff -=2;
            oddDiff +=2;
            System.out.println();
        }
    }
}
