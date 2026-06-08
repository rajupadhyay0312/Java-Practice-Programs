package ProgrammingBatch.Pattern.PatternAssignement;

public class NumberPattern7 {
    public static void main(String[] args){
        for(int i =1; i<=4; i++){
            int num = 1;
            for(int j=1; j<=i; j++){
                if(num == j){
                    System.out.print(j+" * "+j);
                }else{
                    System.out.print(" * "+j+" * "+j);
                }
            }
            System.out.println();
        }
    }
}
