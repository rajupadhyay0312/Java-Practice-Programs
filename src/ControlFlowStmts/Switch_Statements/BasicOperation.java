package ControlFlowStmts.Switch_Statements;

import java.util.Scanner;

public class BasicOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while(flag){
            System.out.println("\n1.Factorial ");
            System.out.println("2.Sum of digit ");
            System.out.println("3.product of digit ");
            System.out.println("4.SpyNum ");
            System.out.println("5.Neon Num ");
            System.out.println("6.Exit");
            System.out.print("Enter a choice :");
            int choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("\nFactorial operation");
                    System.out.print("Enter a num : ");
                    int num = sc.nextInt();
                    int fact = 1;
                    while(num>0){
                        fact =  fact*num;
                        num--;
                    }
                    System.out.println("Factorial Result is : "+fact +"\n");

                }
                break;

                case 2:{
                    System.out.println("\nSum of Digit Operation");
                    System.out.print("Enter a Num : ");
                    int num = sc.nextInt();

                    int last = 0;
                    int sum  = 0;

                    for(; num>0; num/=10){
                        last =  num % 10;
                        sum += last;
                    }
                    System.out.println("Sum of Digit Result is : "+sum);
                }
                break;

                case 3:{
                    System.out.println("\nProduct of digit ");
                    System.out.print("Enter a num : ");
                    int num = sc.nextInt();
                    int prod = 1;
                    int last = 0;
                    for(;num>0; num/=10){
                        last = num % 10;
                        prod *= last;
                    }
                    System.out.println("Product of Digit result is : "+prod);
                }
                break;

                case 4:{
                    System.out.println("\nSpyNum Operation : ");
                    System.out.print("Enter a number :");
                    int num = sc.nextInt();
                    int dup = num;
                    int sum  = 0;
                    int prod = 1;
                    int last = 0;

                    for(; num>0; num/=10){
                         last = num%10;
                         sum += last;
                         prod *= last;
                    }
                    System.out.println("Sum is : "+sum);
                    System.out.println("Product is : "+ prod);

                    if(sum == prod){
                        System.out.println(dup+" is a SpyNum\n");
                    }
                    else{
                        System.out.println(dup+" is not a SpyNum\n");
                    }
                }
                break;

                case 5:{
                    System.out.println("\nNeon Operation : ");
                    System.out.print("Enter a num : ");
                    int num = sc.nextInt();
                    int dup = num;
                    int square = num * num;
                    System.out.println("Square is : " +square);

                    int sum = 0;
                    int last = 0;
                    while(square>0){
                        last = square % 10;
                        sum += last;
                        square/=10;
                    }
                    System.out.println("square of sum is : "+sum);

                    if(num == sum){
                        System.out.println(dup+" is a Neon Number\n");
                    }
                    else{
                        System.out.println(dup+" is Not a Neon Number\n");
                    }
                }
                break;

                case 6:{
                    System.out.println("\nDo you really want to exit?Y/N");
                    char exit = sc.next().charAt(0);

                    if(exit == 'Y' || exit == 'y')
                    {
                        flag = false;
                        System.out.println("ThankYou...!!");
                    }
                }
            }
        }
    }
}
