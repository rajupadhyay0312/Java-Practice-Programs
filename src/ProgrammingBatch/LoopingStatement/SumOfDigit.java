package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter start Num : "); // 1
    int start = sc.nextInt();

    System.out.print("Enter End Num : ");//10
    int end = sc.nextInt();

    int sum =0;
    while(start<=end){
        sum += start;
        start++;
    }
    System.out.println("Sun is : "+sum);
}
}

