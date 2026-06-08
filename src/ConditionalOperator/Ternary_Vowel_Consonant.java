package ConditionalOperator;

import java.util.Scanner;

public class Ternary_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :");
        String str = sc.next();
        char ch = str.toUpperCase().charAt(0);

        String op =
                (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')?
                        (ch+ " is a Vowel"):
                        (ch+ " is a consonant");
        System.out.println(op);

    }
}
