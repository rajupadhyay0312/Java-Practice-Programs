package Strings.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time: ");
        String date = sc.next();
        System.out.println(isValid(date)?date+" valid":date+" invalid");
    }
    public static boolean isValid(String date){

        String regex = "^0[1-9]|1[0-2]:[0-5][0-9]:[0-5][0-9]$";
        return Pattern.matches(regex,date);
    }
}
