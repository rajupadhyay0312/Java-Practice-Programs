package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        int last = num%10;

        if(last == 7 || num%7==0){
            System.out.println("Buzz number");
        }else{
            System.out.println("Not v");
        }
    }
}
