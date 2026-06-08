package Strings.Regex;

import java.util.regex.Pattern;
public class BankAccountNo_Validation {
    public static void main(String[] args) {
        String str = "3757674591";
        System.out.println(isValid(str)?str+" valid":str+" invalid");
    }
    public static boolean isValid(String str){
        String regex ="^[0-9]{9,18}$";
        return Pattern.matches(regex,str);
    }
}
