package ProgrammingBatch.Pattern.PatternAssignement;

public class pattern6 {
    public static void main(String[] args){
        int n = 4;
        //outer loop
        for(int i=0; i<n; i++){
            //space n-i
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
