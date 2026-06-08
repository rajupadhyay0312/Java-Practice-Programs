package ControlFlowStmts.If_Statements.java;

import java.util.Scanner;

public class IF_Example1 {
    /* ----------Approach2----------*/
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in); // Approach...1
//        System.out.print("Enter a Number: ");
//        int num = sc.nextInt();
//
//        if(num%2==0){
//            System.out.println("HiTwo");
//        }
//        if(num%5==0){
//            System.out.println("HiFive");
//        }
//    }

    /* ----------Approach2----------*/
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in); // Approach..2
//        System.out.print("Enter a Number: ");
//        int num =  sc.nextInt();
//
//        if(num%2==0 && num%5 != 0){
//            System.out.println("HiTwo");
//        }
//        if(num%5==0 && num%2 != 0){
//            System.out.println("HiFive");
//        }
//        if(num%2==0 && num%5==0){
//            System.out.println("HiFiveHitwo");
//        }
//        if(!(num%2==0 && num%5==0)){
//            System.out.println("Not in a Range");
//        }
//    }

    /*----------Approach3------------*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Approach..2
        System.out.print("Enter a Number: ");
        String op =" ";
        int num =  sc.nextInt();

        if(num%2==0){
            op = "HiTwo";
        }
        if(num%5==0 && num%2 != 0){
            op = "HiFive";
        }
        if(num%2==0 && num%5==0){
            op = "HiFiveHitwo";
        }
    }
}
