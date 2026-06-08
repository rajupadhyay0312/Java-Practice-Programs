package ProgrammingBatch.NestedLoop;

import java.util.Scanner;

public class DuckNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number : ");
        int start = sc.nextInt();
        System.out.print("Enter end Number : ");
        int end = sc.nextInt();

        while(start<=end){
            int duckNumber = 0;
            int temp = start;

            while(temp!=0){
                if(temp %10 == duckNumber){
                    break;
                }
                temp/=10;
            }
            if(temp != 0){
                System.out.println(start+" is DuckNumber");
            }
            start++;
        }

    }
}
