package ProgrammingBatch.Pattern;

public class pattern9 {
    public static void main(String[] args){
        int n = 4;
        //outer loop
        for(int i=0; i<n; i++){
            //space n-i-1
            for(int space=0; space<i; space++){
                System.out.print("  ");
            }
            //star
            for(int star=0; star<((n-i)*2)-1; star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
