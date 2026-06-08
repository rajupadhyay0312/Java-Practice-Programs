package Method.Parametrized_Argument;

import java.util.Scanner;
public class LengthOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("Num is : "+num);
        lengthOfNum(num);
    }
    public static void lengthOfNum(int num){
        int length = 0;
        for(; num>0; num/=10){
            length++;
        }
        System.out.println("count of number is : "+length);
    }
}
