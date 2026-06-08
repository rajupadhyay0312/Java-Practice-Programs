package Method.Parametrized_Argument;

import java.util.Scanner;

public class charAt {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");//suresh
        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            char op =charAt(str,i);
            System.out.print(op+" ");
            Thread.sleep(500);
        }
    }
    public static char charAt(String str, int indx){
        char[] arr = str.toCharArray();
        char ch = arr[indx];
        return ch;
    }
}
