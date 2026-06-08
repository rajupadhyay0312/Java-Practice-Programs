package Method.Parametrized_Argument;

import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num = sc.nextInt();

        System.out.print("Enter a Power : ");
        int pow = sc.nextInt();

        power(num, pow);
    }
    public static void power(int num, int pow){
        int result = 1;
        for(int i=1; i<=pow; i++){
            result = result*num;
        }
        System.out.println("Result is : "+result);
    }
}
