package Recursion;

public class Using_Return_ReverseNumber {
    public static void main(String[] args) {
        int num = 12;
        System.out.println("Before reverse : " + num);
        int rev = reverseNumber(num, 0);
        System.out.println("After reverse : " + rev);
    }

    public static int reverseNumber(int num, int rev) {
        if (num <= 0)
            return rev;
        int rem = num % 10;
        rev = rev * 10 + rem;
        num /= 10;
        return reverseNumber(num, rev);
    }
}
