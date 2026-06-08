package Strings;

public class FindAsciiValueOfEachCharacter {
    public static void main(String[] args) {
        String str = "java is easy";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = ch;
            System.out.println(ch+" : "+ascii);
        }
    }
}
