package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter n2 : ");
        int n2 = sc.nextInt();

        int largest = n1 > n2 ? n1 : n2;

        for(int i =1; ;i++){
            if((largest*i)%n1==0 && (largest*i)%n2==0){
                System.out.println("The lcm is : "+(largest*i));
                break;
            }
        }

    }
}
