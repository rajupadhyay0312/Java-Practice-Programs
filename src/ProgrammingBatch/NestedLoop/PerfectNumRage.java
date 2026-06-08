package ProgrammingBatch.NestedLoop;

import java.util.Scanner;

public class PerfectNumRage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number : ");
        int start = sc.nextInt();
        System.out.print("Enter end Number : ");
        int end = sc.nextInt();
        while(start<=end){
            int sum = 0;
            int den = 1;
            while(den<=start/2){
                if(start % den == 0){
                    sum += den;
                }
                den++;
            }
            if(start == sum){
                System.out.println( start+ " is perfect");
            }
            start++;
        }
    }
}
