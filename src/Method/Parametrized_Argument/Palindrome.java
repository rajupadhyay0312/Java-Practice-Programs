package Method.Parametrized_Argument;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num+" isPalindrome");
        }else{
            System.out.println(num+ " is not palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int rev = 0, temp=num;
        while(num>0){
            int rem = num %10;
            rev = rev * 10 + rem;
            num/=10;
        }
        return rev == temp;
    }
}
