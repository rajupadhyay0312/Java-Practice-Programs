package Recursion;

import java.util.Scanner;

public class Factorial {
    static int fact = 1;
    public static void main(String[] args){
        int num = 6;
        printFactorial(num, 1);
        System.out.println(fact);
    }
    public static void printFactorial(int num , int i){
        fact = fact * i;
        if(i>=num) return;
        printFactorial(num, ++i);

    }
}
