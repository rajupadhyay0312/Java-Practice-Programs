package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value : ");
        int num = 0;
        try{
            num = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid resp");
        }
        System.out.println("Num : "+num);
    }
}
