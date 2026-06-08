package Recursion;

import java.util.Scanner;
public class ReverseNum {
    static int rev = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        printReverseNumber(num);
        System.out.println("reverse is : " + rev);
    }
    public static void printReverseNumber(int num){
        rev = rev * 10 + (num % 10);
        num/=10;
        if(num==0) return;
        printReverseNumber(num);
    }
}
