package Strings.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidation {
    public static void main(String[] args) {
        //FORMAT DD-MM-YYYY
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date: ");
        String date = sc.next();
        System.out.println(isValid(date)?date+" valid":date+" invalid");
    }
    public static boolean isValid(String date){
                              // 01                  /     01           /    2025
        String regex = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1])/?-?(0[1-9]|1[0-2])/?-?[0-9]{4}$";
        return Pattern.matches(regex,date);
    }
}
