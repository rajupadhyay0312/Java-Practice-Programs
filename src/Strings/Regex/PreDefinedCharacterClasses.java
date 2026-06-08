package Strings.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClasses {
    public static void main(String[] args) {
        String str = "JaVA@13_ea7 s&";
//        String regex = ".";
//        String regex = "\\d"; //A digit[0-9]
//        String regex = "\\D"; //A non-digit[^0-9]
//        String regex = "\\s"; //A whitespace character
//        String regex = "\\S"; //A non-whitespace character
//        String regex = "\\w"; //A word character
        String regex = "\\W";  //A non word character
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group()+" - "+matcher.start());
        }
    }
}
