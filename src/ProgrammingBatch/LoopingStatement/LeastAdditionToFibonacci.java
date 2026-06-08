package ProgrammingBatch.LoopingStatement;

/*
tell me the least value to be added to make a given number as a fibonacci number.
example:- 11 must be added with 2 to make it.....
* */

import java.util.Scanner;

public class LeastAdditionToFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num =  sc.nextInt();

        int n1=0, n2=1, n3;
        while(n2<num) {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
        int k = n2-num;
        System.out.println("Least value to be added "+ k);
        System.out.println("Resulting of Fibonacci "+ n2);

    }

}
