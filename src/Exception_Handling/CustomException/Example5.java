package Exception_Handling.CustomException;

import java.util.Scanner;

class AgeNotValidException extends RuntimeException{
    AgeNotValidException(String desc){
        super(desc);
    }
}
public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        checkAge(age);
        System.out.println("Main ends");
    }
    public static int checkAge(int age){
        if(age>=18){
            System.out.println("Eligible for vote");
        }else{
            try{
                throw new AgeNotValidException("Age is not valid for voting ");
            }catch(AgeNotValidException e){
                System.out.println(e.getMessage());
            }
        }
        return age;
    }
}
