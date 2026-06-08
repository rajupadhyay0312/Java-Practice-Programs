package ProgrammingBatch.LoopingStatement;

//print prime digit of a number....
import java.util.Scanner;

public class PrimeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = sc.nextInt();

        while(num!=0)
        {
            int digit = num%10;
            int den = 2;

            if(digit>1)
            {
                while(den<=digit/2)
                {
                    if(digit%den==0){
                        break;
                    }
                    den++;
                }
                if(den>digit/2)
                {
                    System.out.print(digit+" ");
                }
            }
            num/=10;
        }
    }

}
