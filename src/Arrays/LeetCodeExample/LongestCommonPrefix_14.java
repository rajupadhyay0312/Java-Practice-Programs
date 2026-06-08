package Arrays.LeetCodeExample;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String  [] str = {"flower","flow","flight"};
        System.out.println(Arrays.toString(str));
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String [] strs){
        String op = "";
        String fe = strs[0];//flower

        outerLoop:
        for(int i=0; i<fe.length(); i++){
            for(int j=1; j<strs.length; j++){
                if(strs[j].length()==i) break outerLoop;
                if(fe.charAt(i)!=strs[j].charAt(i)){
                    break outerLoop;
                }
            }
            op+=fe.charAt(i);
        }
        return op;
    }
}
