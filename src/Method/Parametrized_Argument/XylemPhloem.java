package Method.Parametrized_Argument;

import java.util.Scanner;

public class XylemPhloem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isXylemPhloem(num)) {
            System.out.println(num + " is xylemPhloem");
        } else {
            System.out.println(num + " is not xylemPhloem");
        }
    }

    public static boolean isXylemPhloem(int num) {
        int sumOfEnd = num % 10;
        num /= 10;
        int sumOfMiddle = 0;

        while (num > 9) {
            sumOfMiddle += num % 10;
            num /= 10;
        }
        sumOfEnd += num;

        return sumOfEnd == sumOfMiddle;

    }
}
