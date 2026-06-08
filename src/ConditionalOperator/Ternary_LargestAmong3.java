package ConditionalOperator;

import java.util.Scanner;

public class Ternary_LargestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Num1 :");
        int a =  sc.nextInt();

        System.out.print("Enter a Num2 :");
        int b = sc.nextInt();

        System.out.print("Enter a Num3 :");
        int c = sc.nextInt();

        int largest =
                (a > b) ? (a > c ? a : c): (b > c ? b : c);

        System.out.printf("Largest number among (%d, %d, %d) is : %d",a,b,c,largest);

    }
}
