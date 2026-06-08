package ProgrammingBatch.NestedLoop;

import java.util.Scanner;

public class BuzzRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number : ");
        int start = sc.nextInt();
        System.out.print("Enter end Number : ");
        int end = sc.nextInt();

        while(start<=end){
            int temp = start;
            int last = temp%10;

            if(last == 7 || start%7 == 0){
                System.out.println(start+" is Buzz Number");
            }
            start++;
        }
    }
}
