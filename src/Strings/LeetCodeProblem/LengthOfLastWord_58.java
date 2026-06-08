package Strings.LeetCodeProblem;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String str = "Java Programing";
        System.out.println(lastWord(str));
    }
    public static int lastWord(String str){
        String[] arr = str.split(" ");
        return arr[arr.length - 1].length();
    }
}
