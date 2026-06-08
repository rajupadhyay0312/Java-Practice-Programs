package ProgrammingBatch.NestedLoop;

import java.util.Scanner;

public class TwistedPrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number : ");
        int start = sc.nextInt();
        System.out.print("Enter end Number : ");
        int end = sc.nextInt();

       while(start<=end){
           int den = 2;
           int temp = start;

           while(den <= start/2) {
               if (start % den == 0) {
                   break;
               }
               den++;
           }
               if(den>start/2){
                   int rev = 0;
                   int revTemp = temp;
                   while(revTemp!=0){
                       rev =  rev *10 + revTemp% 10;
                       revTemp/=10;
                   }

                   den =2;
                   while(den <= rev/2){
                       if(rev%den == 0){
                           break;
                       }
                       den++;
                   }
                   if(den>rev/2){
                       System.out.println(temp);
                   }
               }
               start++;
           }
       }

}

