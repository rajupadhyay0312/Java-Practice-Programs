package ConditionalOperator;

import java.util.Scanner;

public class Ternary_SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character :");
        char ch = sc.next().charAt(0);

        String op =
                (!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')))?
                        (ch+ " is a special Character"):
                        (ch+" is not a special character");

        System.out.println(op);

    }
}
