package Strings;

public class LargestSubSequencePalindrome {
    public static void main(String[] args) {
        String str = "ababacabadef";
        int max =0;
        String largest="";
        for(int i=0;i<str.length(); i++){
            String str1 = str.charAt(i)+"";
            for(int j=i+1;j<str.length();j++){
                str1+=str.charAt(j);
                if(isPalindrome(str1)){
                    if(str1.length()>max){
                        max=str1.length();
                        largest=str1;
                    }
                }
            }
        }
        System.out.println(largest);
    }
    public static boolean isPalindrome(String str){
        if(str.length()==1) return false;
        for(int i=0,j=str.length()-1; i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)) return false;
        }
        return true;
    }
}
