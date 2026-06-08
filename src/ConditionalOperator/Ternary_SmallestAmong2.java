package ConditionalOperator;

import java.util.Scanner;

public class Ternary_SmallestAmong2 {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter a num1 :");
             int a = sc.nextInt();

             System.out.print("Enter a num2 :");
             int b = sc.nextInt();

             int smallest = (a < b)?(a) : (b);
             System.out.printf("Smallest number among (%d, %d) is : %d",a,b,smallest);
         }
}
