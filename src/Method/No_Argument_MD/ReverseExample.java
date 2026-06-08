package Method.No_Argument_MD;

import java.util.Scanner;

public class ReverseExample {
    static int num;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entera Number");
        num =  sc.nextInt();
        System.out.println("Before : "+num);
        reverseNumber();
        System.out.println("After : "+num);

    }
public static void reverseNumber() {
    int rev = 0;
    while (num > 0) {
        int rem = num % 10;
        rev = rev * 10 + rem;
        num /= 10;
    }
    num = rev;
}
}
