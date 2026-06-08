package Strings.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyQuantifiers {
    public static void main(String[] args) {
        String str = "aaa ab aaaa bc aaaaa";
//        String regex = "a?";
//        String regex = "a*";
//        String regex = "a+";
//        String regex = "a{3}";
//        String regex = "a{3,}";
        String regex = "a{3,4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group()+" : "+matcher.start());
        }
    }
}
