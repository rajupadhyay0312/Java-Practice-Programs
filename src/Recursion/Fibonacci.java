package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int n1=0, n2=1;
        System.out.print(n1+" "+n2+" ");
        printFibonacci(n1,n2, num-2);
    }
    public static void printFibonacci(int n1, int n2, int count){
        if(count == 0) return;
        int n3 = n1 + n2;
        System.out.print(n3+" ");
        printFibonacci(n2,n3,count-1);
    }
}
