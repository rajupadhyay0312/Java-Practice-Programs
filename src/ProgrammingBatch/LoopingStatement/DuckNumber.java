package ProgrammingBatch.LoopingStatement;

//check if number is duck Number or not :-
//If zero is present then it is a duck Number or else not a duck Number....
import java.util.Scanner;
public class DuckNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num  = sc.nextInt();

        int duckNum = 0;
        while(num>0){// we can also take num!=0..
            if(num%10==duckNum){
                break;
            }
            num/=10;
        }
        if(num==0) {
            System.out.println("It is not a duckNum");
        }
        else{
            System.out.println("It is duckNum");
        }
    }
}
