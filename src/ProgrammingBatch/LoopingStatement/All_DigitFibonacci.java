package ProgrammingBatch.LoopingStatement;

//check if all the digit of a number are fibonacci
import java.util.Scanner;

public class All_DigitFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
       // int n1=0, n2=1, n3;

        while (num != 0) {
            int last = num % 10;
            if (!(last == 0 || last == 1 || last == 2 || last == 3 || last == 5 || last == 8)) {
                break;
            }
            num /= 10;
        }
        if (num == 0) {
            System.out.println("All the digit is Fibonacci");
        } else {
            System.out.println("All the digit are not Fibonacci");
        }
    }
}
