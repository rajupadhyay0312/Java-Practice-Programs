package Strings.LeetCodeProblem;

public class IndexOfFirstOccurrence_28 {
    public static void main(String[] args) {
        String str1 = "sadbutsad";
        String str2 = "sad";
        System.out.println(strStr(str1,str2));
    }
    public static int strStr(String str1, String str2){
        for(int i=0; i<=str1.length()-str2.length(); i++){
            int j=0;
            for(; j<str2.length(); j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    break;
                }
            }
            if(j==str2.length()) return i;
        }
        return -1;
    }
}
