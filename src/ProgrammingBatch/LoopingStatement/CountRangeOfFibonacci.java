package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;
public class CountRangeOfFibonacci {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int start =  sc.nextInt();
        System.out.print("Enter end number : ");
        int end =  sc.nextInt();

        int n1=0, n2=1, n3;
        int count = 0;

        while(n1<end){
            n3=n1+n2;
            if(n3>=start){
                System.out.print(n3+" ");
                 count++ ;
            }
            n1=n2;
            n2=n3;
        }
        System.out.println("\nCount of Fibonacci numbers in range: " + count);    }
}
