package Strings.LeetCodeProblem;

public class FirstUniqueCharacterInString_387 {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstUniqueChar(str));
    }
    public static int firstUniqueChar(String str){
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int cnt =1;
            for(int j=i+1; j<str.length(); j++){
                if(ch==str.charAt(j)){
                    cnt++;
                }
                if(cnt>1) break;
            }
            if(cnt==1) return i;
        }
        return -1;
    }
}
