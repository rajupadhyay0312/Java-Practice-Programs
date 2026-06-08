package Strings;

public class Longest_Word_Paragraph {
    public static void main(String[] args) {
        String str = "java is a easy programming language   ";
        String[] arr = str.split(" ");
        int maxLen = Integer.MIN_VALUE;
        String longestWord = " ";
        for(int i=0; i<arr.length;i++){
            String word = arr[i];
            int len =0;
            for(int j=0;j<word.length();j++){
                len++;
            }
            if(maxLen<len){
                maxLen = len;
                longestWord=word;
            }
        }
        System.out.println("Longest word in a paragraph is: "+longestWord);
        System.out.println("count of longest Word: "+maxLen);
    }
}
