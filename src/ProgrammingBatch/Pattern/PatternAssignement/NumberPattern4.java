package ProgrammingBatch.Pattern.PatternAssignement;

public class NumberPattern4 {
    public static void main(String[] args){
        int n =5, evenDiff=n+2*n-6, oddDiff=1;
        for( int i =1; i<=n; i++){
            int num = i;
            System.out.print(num+" ");
            for( int j=1;j<i; j++){
                if(j%2==0){
                    num += evenDiff;
                    System.out.print(num+" ");
                }
                else{
                    num += oddDiff;
                    System.out.print(num+" ");
                }
            }
            System.out.println();
        }
    }
}
