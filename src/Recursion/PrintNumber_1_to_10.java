package Recursion;

public class PrintNumber_1_to_10 {
    public static void main(String[] args){
        printNumber(0);
    }
    public static void printNumber(int num){
        if(num>=10 )
            return;
        printNumber(++num);
        System.out.println(num+" ");
    }
}
