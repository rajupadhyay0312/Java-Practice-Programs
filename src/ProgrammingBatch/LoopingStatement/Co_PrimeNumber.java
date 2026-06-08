package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class Co_PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2 : ");
        int n2 = sc.nextInt();

        int small = n1<n2?n1:n2;

        while(true){
            if(n1%small == 0 && n2%small == 0){
                break;
            }
            small--;
        }
        if(small == 1){
            System.out.println("They are co prime");
        }else{
            System.out.println("Not co prime");
        }
    }
}
