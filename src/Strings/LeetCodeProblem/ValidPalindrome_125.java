package Strings.LeetCodeProblem;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase().replaceAll("[^a-z0-9]","");
        if(str.length()==0) return true;
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)) return false;
        }
        return true;
    }
}
