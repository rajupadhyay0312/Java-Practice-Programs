package Method.Parametrized_Argument;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String op = isEvenOdd(num);
        System.out.println(op);
        //System.out.println(isEvenOdd(num));
        //isEvenOdd(num);
    }
    public static String isEvenOdd(int num) {
        if (num % 2 == 0) {
            return num + " is Even";
        } else {
            return num + " is odd";
        }
    }
}
