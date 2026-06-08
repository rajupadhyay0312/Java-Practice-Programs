package ProgrammingBatch.NestedLoop;

import java.util.Scanner;

public class XylemPhloemRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter end : ");
        int end = sc.nextInt();

        while(start<=end){
            int temp = start;
            int sumOfEnd = temp % 10;
            temp/=10;
            int sumOfMiddle = 0;

            while(temp>9){
                sumOfMiddle += temp % 10;
                temp/=10;
            }
            sumOfEnd += temp;

            if(sumOfEnd == sumOfMiddle){
                System.out.println(start+ " is XylemPhloem");
            }
            start++;
        }
    }
}
