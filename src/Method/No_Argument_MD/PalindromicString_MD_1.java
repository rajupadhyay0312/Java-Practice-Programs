package Method.No_Argument_MD;

import java.util.Scanner;

public class PalindromicString_MD_1 {

    static String str, rev="";
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String : ");
        str = sc.next();

        reverseString2();

        if(str.equals(rev)){
            System.out.println(str+" it is a palindromicString");
        }
        else{
            System.out.println(str+" it is not a  palindromicString");
        }
    }
    //Start from 0 and store new char first
    public static void reverseString1(){
        for(int i=0; i<str.length(); i++)
            rev = str.charAt(i)+rev;
    }
    //start from last and store new char after old char
    public static void reverseString2(){
        for(int i=str.length()-1; i>=0; i--)
            rev += str.charAt(i);
    }

}
