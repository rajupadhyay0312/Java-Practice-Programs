package ProgrammingBatch.Pattern.PatternAssignement;

public class NumberPattern1 {
    public static void main(String[] args){
        int n = 4;
        for(int i=1; i<=n; i++){
            int num = i;
            System.out.print(num+" ");
            for(int j=1; j<n; j++){
                num += n;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
