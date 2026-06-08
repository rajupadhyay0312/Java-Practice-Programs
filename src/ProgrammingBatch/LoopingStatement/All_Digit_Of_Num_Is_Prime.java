package ProgrammingBatch.LoopingStatement;

//Check if all digit is a number is prime...
import java.util.Scanner;

public class All_Digit_Of_Num_Is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();

        while (num != 0) {
            int last = num % 10;
            if (!(last == 2 || last == 3 || last == 5 || last == 7)) {
                break;
            }
            num /= 10;
        }
        if (num == 0) {
            System.out.println("all the digit is prime");
        } else {
            System.out.println("All the digit are not prime");
        }
    }
}
