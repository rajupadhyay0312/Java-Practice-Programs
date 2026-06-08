package ProgrammingBatch.LoopingStatement;

//print all the fibonacci number between the given range(10 to 100)
import java.util.Scanner;

public class RangeOfFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting Num : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending Num : ");
        int end = sc.nextInt();
       int n1=0,n2=1,n3;

       while(n1<=end)
       {
           n3 = n1+n2;
           if(n1>=start)
           {
               System.out.print(n1+" ");
           }
           n1=n2;
           n2=n3;
        }
    }
}
