package Exception_Handling.ThrowableClass;

import java.util.Scanner;

class AgeNotValidException extends RuntimeException {
    AgeNotValidException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " : " +getMessage();
    }
}

public class ToString_MethodExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for vote");
        } else {
            try {
                throw new AgeNotValidException(age + " ");
            } catch (AgeNotValidException e) {
                System.out.println(e);
            }
        }
    }
}
