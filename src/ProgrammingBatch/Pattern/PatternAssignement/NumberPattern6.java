package ProgrammingBatch.Pattern.PatternAssignement;

public class NumberPattern6 {
    public static void main(String[] args){
        for(int i = 1; i<=4; i++){
            int num = i*(i+1)/2;
            int value = num;

            for(int j=1; j<=i; j++){
                System.out.print(value+" ");
                value--;
            }
            System.out.println();
        }
    }
}
