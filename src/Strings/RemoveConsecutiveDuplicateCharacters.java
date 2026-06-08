package Strings;

public class RemoveConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "aaabbcdd";
        String op="";
        op += str.charAt(0);
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                op+=str.charAt(i);
            }
        }
        System.out.println(op);
    }
}
