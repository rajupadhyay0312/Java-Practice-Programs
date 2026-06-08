package Recursion;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number : ");
        int num = sc.nextInt();

        printMultiplicationTable(num, 1);
    }
    public static void printMultiplicationTable(int num , int i){

        System.out.println(num + " X "+ i+" = "+(num*i));
        if(i>=10) return;
        printMultiplicationTable(num, ++i);
    }
}
