package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = sc.nextInt();

        int small = n1 < n2 ? n1 : n2;

        while (true) {
            if (n1 % small == 0 && n2 % small == 0) {
                System.out.println("The Hcf is : " + small);
                break;
            }
            small--;
        }
    }
}

/*
* HCF is always less than or equal to the smallest number.
* If one number divides the other completely, then the smaller number itself is the HCF.
  Example: HCF of 12 and 36 = 12
*
*  */
