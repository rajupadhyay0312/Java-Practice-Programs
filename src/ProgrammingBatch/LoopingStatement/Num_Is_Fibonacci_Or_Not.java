package ProgrammingBatch.LoopingStatement;

//Number is Fibonacci or not...
import java.util.Scanner;

public class Num_Is_Fibonacci_Or_Not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num :");//30
        int num = sc.nextInt();
        int n1=0,n2=1,n3;

        while(true){
            n3=n1+n2;
            if(n1==num){
                System.out.println("It is fibonacci Num");
                break;
            }
            else if(n1>num){
                System.out.println("Not a fibonacci num");
                break;
            }
            else{
                n1=n2;
                n2=n3;
            }
        }
    }
}
