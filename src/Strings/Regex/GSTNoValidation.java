package Strings.Regex;

import java.util.regex.Pattern;
public class GSTNoValidation {
    public static void main(String[] args) {
        String str ="27AAPFU0939F1ZV";
        System.out.println(isValid(str)?str+" valid":str+" is Valid");
    }
    public static boolean isValid(String str){
        String regex ="^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]Z[0-9A-Z]{1}$";
        return Pattern.matches(regex,str);
    }
}
