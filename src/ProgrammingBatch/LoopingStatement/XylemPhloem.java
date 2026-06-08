package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;
public class XylemPhloem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");// eg:- 123456....
        int num = sc.nextInt();

        int sumOfEnd = num%10;
        num/=10;
        int sumOfMiddle = 0;

        while(num>9){
            sumOfMiddle += (num%10);
            num/=10;
        }
        sumOfEnd =  sumOfEnd + num;

        if(sumOfMiddle==sumOfEnd){
            System.out.println("It is  Xylem");
        }
        else{
            System.out.println("It is Phloem");
        }

    }
}
