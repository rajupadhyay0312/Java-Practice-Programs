package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class SumOfEven_and_SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num = sc.nextInt();
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int last = 0;

        while (num > 0) {
            last = num % 10;
            if (last % 2 == 0) {
                sumOfEven += last;
            } else {
                sumOfOdd += last;
            }
            num /= 10;
        }
        if (sumOfEven == sumOfOdd) {
            System.out.println("They are  balance");
        } else {
            System.out.println("They are not balance");
        }

    }

}
