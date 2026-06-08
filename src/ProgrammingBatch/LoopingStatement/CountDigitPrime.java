package ProgrammingBatch.LoopingStatement;

//Count of digit id prime....
import java.util.Scanner;

public class CountDigitPrime {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0)
        {
            int digit = num%10;
            int den = 2;

            while(den<digit)
            {
                if(digit%den==0){

                    break;
                }
                den++;

            }
            if(den==digit)
            {
                count++;
            }
            num/=10;
        }
        if(num==0)
        {
            System.out.println("The count of Prime is :"+count);
        }
    }

}
