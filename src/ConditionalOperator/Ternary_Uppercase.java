package ConditionalOperator;

import java.util.Scanner;

public class Ternary_Uppercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charcater :");
        char ch = sc.next().charAt(0);

        String op =
                (ch>=65 && ch<=90)?//UPPERCASE
                        (ch+" is UPPER CASE "):
                        (ch+" is not a UPPER CASE ");

        System.out.println(op);
    }
}
