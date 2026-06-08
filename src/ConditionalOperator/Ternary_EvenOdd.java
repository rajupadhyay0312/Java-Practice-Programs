package ConditionalOperator;

import java.util.Scanner;

public class Ternary_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        String op =
                (num % 2 == 0 )?
                        (num + " is a Even number : "):
                        (num +" is a odd number : ");

        System.out.println(op);
        sc.close();
    }
}
