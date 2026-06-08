package Strings.LeetCodeProblem;

public class FindTheDifference_389 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";
        System.out.println(findTheDifference(str1,str2));
    }
    public static char findTheDifference(String s, String t){
          int sum =0;
          for(int i=0;i<s.length();i++){
              sum+=s.charAt(i);
          }
          for(int j=0;j<t.length();j++){
              sum-=t.charAt(j);
          }
        return (char)(-sum);
    }
}
