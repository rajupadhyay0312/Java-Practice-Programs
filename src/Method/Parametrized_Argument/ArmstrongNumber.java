package Method.Parametrized_Argument;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int originalNum = num;
        int temp = num;

        //Step 1 - count Digit
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("count is : "+count);

        //Step 2 - compute the armstrong
        int sum =0;
        while(temp>0){
            int digit =temp % 10;
            sum += power(digit,count);
            temp /= 10;
        }
        System.out.println("sum is : "+sum);

        // Step 3 - compare
        if(sum == originalNum){
            System.out.println(originalNum +" is armstrong number");
        }else{
            System.out.println(originalNum +" is not an  armstrong number");
        }

    }
    public static int  power(int num , int pow){
        int result = 1;
        for(int i =1; i<=pow; i++){
            result = result * num;
        }
        return result;
    }
}
