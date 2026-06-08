package Strings.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String regex = "[AEIOU]";
        String mainStr = "AABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mainStr);

        while (matcher.find()){
            System.out.println(matcher.start());
        }
    }
}
