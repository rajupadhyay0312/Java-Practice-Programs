package ProgrammingBatch.Pattern.PatternAssignement;

public class NumberPattern10 {
    public static void main(String[] args){
        int n=4;
        for(int i=1; i<=n; i++){
            int num =i;
            System.out.print(num+" ");
            for(int j=1; j<i; j++){
                num+=n-j;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

