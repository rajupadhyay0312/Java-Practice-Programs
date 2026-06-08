package Strings.LeetCodeProblem;

public class WordPatternExample_290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");

        if (pattern.length() != word.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    if (!word[i].equals(word[j])) return false;
                } else {
                    if (word[i].equals(word[j])) return false;
                }
            }
        }
        return true;
    }
}
