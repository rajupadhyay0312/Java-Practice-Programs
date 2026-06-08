package ProgrammingBatch.Pattern.PatternAssignement;

public class pattern5 {
    public static void main(String[] args){
        int n = 7;
        //outer loop
        for(int i=0; i<n; i++){
            //space n-i-1
            for(int space=0; space<n-i-1; space++){
                System.out.print("  ");
            }
            //star
            for(int star=0; star<=2*i; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
