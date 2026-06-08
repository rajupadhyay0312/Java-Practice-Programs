package ProgrammingBatch.LoopingStatement;

//Write a java program to check sum of digit is equal to product of digit or not...
import java.util.Scanner;
public class SumOfDigit_and_ProductOfDigit {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a NUmber : ");
        int num = sc.nextInt();

        int prod = 1;
        int sum = 0;
        int last = 0;

        while(num>0){
            last = num%10;
            sum += last;
            prod += last;
        }
        System.out.println("Sum is : "+sum);
        System.out.print("Product of :"+prod);

        if(sum == prod){
            System.out.println("is a SpyNum");
        }
        else{
            System.out.println("is not a SpyNum");
        }
    }

}
