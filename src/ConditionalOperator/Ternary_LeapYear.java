package ConditionalOperator;

import java.util.Scanner;

public class Ternary_LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year :");
        int year =  sc.nextInt();

        String op =
                ((year % 100!=0 || year%400 ==0) && year%4 ==0)?
                        (year + " is a leaf year :"):
                        (year +" is not a leaf year :");

        System.out.println(op);


    }
}
