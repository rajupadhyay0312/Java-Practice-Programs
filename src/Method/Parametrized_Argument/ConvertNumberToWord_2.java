package Method.Parametrized_Argument;

import java.util.Scanner;

public class ConvertNumberToWord_2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        convertNumberToWord(num);
    }
    public static void convertNumberToWord(int num){
        String words = " ";
        int temp = num;
        if(num ==0 ){
            words = "zero";
        }
        while(num>0){
            int rem = num % 10;
            words = switch(rem){
                case 0 -> "zero "+words;
                case 1 -> "one " + words;
                case 2 -> "two " + words;
                case 3 -> "three " + words;
                case 4 -> "four " + words;
                case 5 -> "five " + words;
                case 6 -> "six " + words;
                case 7 -> "seven " + words;
                case 8 -> "eight " + words;
                case 9 -> "nine " + words;
                default-> " "+words;
            };
            num/=10;
        }
        System.out.println(temp+" : "+words);
    }
}
