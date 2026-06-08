package Strings;

public class Longest_Word_In_ParagraphApproach2 {
    public static void main(String[] args) {
        String str = "java is programming language ";
        longestWord(str);
    }
    public static void longestWord(String str) {
        String longest = "";
        for (String word : str.split(" "))
            if (word.length() > longest.length())
                longest = word;
        System.out.println(longest);
    }
}
