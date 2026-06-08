package ConditionalOperator;

import java.util.Scanner;

public class Ternary_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character :");
        char ch = sc.next().charAt(0);

        String op =
                (ch>=97 && ch<=122)?
                        (ch+ " is a Lowercase :"):
                        (ch+" is Not a lowerCase :");
        System.out.println(op);
    }
}
