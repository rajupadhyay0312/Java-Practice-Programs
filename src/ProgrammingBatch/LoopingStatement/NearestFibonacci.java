package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class NearestFibonacci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Num: ");
    int num = sc.nextInt();
    int n1 = 0, n2 = 1, n3;

    while(n1<=num){
        n3=n1+n2;
        n1=n2;
        n2=n3;
    }
    if(n1==num){
        System.out.println("It is fibonacci ");
    }
    else if(num-n1<n2-num){
        System.out.println(n1+" is the nearest fibo number");
    }
    else{
        System.out.println(n2+" is the nearest fibo number");
    }
}
}
