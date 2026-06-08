package Method.No_Argument_MD;

import java.util.Scanner;

public class PalindromicString_MD_2 {
    static String str;
    static boolean condt = true;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        str = sc.next();
        isPalindrome();


        if(condt){
            System.out.println(str+" it is a palindromicString");
        }
        else{
            System.out.println(str+" it is not a palindromicString");
        }
    }
    public static void isPalindrome(){
        for(int i=0 ,j=str.length()-1; i<j; i++, j-- ){
            if(str.charAt(i)!=str.charAt(j)){
                condt=false;
                return;
            }
        }

    }
}
