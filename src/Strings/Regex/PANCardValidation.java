package Strings.Regex;

import java.util.regex.Pattern;

public class PANCardValidation {
    public static void main(String[] args) {
            String str = "ABCDE1234F";
            System.out.println(isValid(str)?str+" valid":str+" invalid");
        }
        public static boolean isValid(String str){
            String regex ="^[A-Z]{5}\\d{4}[A-Z]{1}";
            return Pattern.matches(regex,str);
        }
}
