package Method.No_Argument_MD;

import java.util.Scanner;

public class FactorOfNum {
    static int num;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number :");
        num = sc.nextInt();

        factor();
    }
    public static void factor(){
        for(int i =1; i<=num/2; i++)
            if(num%i == 0)
                System.out.println("factor are: "+i);
    }
}
