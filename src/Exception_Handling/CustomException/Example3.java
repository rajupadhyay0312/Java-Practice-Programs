package Exception_Handling.CustomException;

import java.util.Scanner;
class UserArithmeticException extends RuntimeException{
    UserArithmeticException(String desc){
        super(desc);
    }
}
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int output = divide(num1,num2);
        System.out.println(output);
    }
    public static int divide(int num1, int num2){
        if(num2==0)
            throw new UserArithmeticException("Cannot divide a number by zero");
        return num1/num2;
    }
}
