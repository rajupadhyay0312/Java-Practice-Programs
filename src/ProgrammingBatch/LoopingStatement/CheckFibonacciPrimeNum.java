package ProgrammingBatch.LoopingStatement;

//check if a number is fibonacci prime number....
import java.util.Scanner;
public class CheckFibonacciPrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();
        int n1=0,n2=1,n3;
        while(true) {
            n3 = n1 + n2;
            if (n1 == num) {
                //System.out.println("It is fibonacci Num");
                break;
            } else if (n1 > num) {
               // System.out.println("Not a fibonacci num");
                break;
            } else {
                n1 = n2;
                n2 = n3;
            }
        }
        int den = 2;
        while(den<num){
            if(num%den==0){
                break;
            }
            den++;
        }
        if(n1==num && den==num){
            System.out.println("It is a fibonacci prime");
        }
        else{
            System.out.println("It not a fibonacci prime");
        }
    }
}
