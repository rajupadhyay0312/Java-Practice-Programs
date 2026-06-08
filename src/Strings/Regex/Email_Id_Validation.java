package Strings.Regex;

import java.util.regex.Pattern;
public class Email_Id_Validation {
    public static void main(String[] args) {
        String str ="raj.upadhyay7084@gmail.com";
        System.out.println(isValid(str)?str+" valid":str+" invalid");
    }
    public static boolean isValid(String str){
        String regex = "^[A-Za-z0-9_.+%-]{5,}+@[a-zA-Z0-9]{2,15}+\\.[a-z]{2,3}$";
        return Pattern.matches(regex,str);
    }
}
