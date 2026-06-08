package Strings.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass {
    public static void main(String[] args) {
        String str = "abefmnxopyzABC123@#";
//        String regex = "[abc]";
//        String regex = "[^abc]";
//        String regex = "[a-zA-Z]";
//        String regex = "[a-d[m-p]]";
//        String regex = "[a-z&&[^bc]]";
        String regex = "[a-z&&[^m-p]]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group()+" - "+matcher.start());
        }
    }
}
