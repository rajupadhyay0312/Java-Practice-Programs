package Method.Parametrized_Argument;

import java.util.Scanner;
// Using Traditional Switch
public class ConvertNumberToWord_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
            switch(rem){
                case 0 : words = " Zero " + words; break;
                case 1 : words = " One " + words; break;
                case 2 : words = " Two " + words; break;
                case 3 : words = " Three " + words; break;
            }
            num/=10;
        }
        System.out.println(temp+" : "+ words);
    }
}
