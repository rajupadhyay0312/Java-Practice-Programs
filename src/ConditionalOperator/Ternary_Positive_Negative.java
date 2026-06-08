package ConditionalOperator;

import java.util.Scanner;

public class Ternary_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num =  sc.nextInt();

        String  op =
                (num<0)?
                        (num+" is a negative"):
                        (num+ " is a positive");

        System.out.println(op);
    }
}
