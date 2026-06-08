package Strings;

public class Move_All_Alphabets_ToThe_BeginningString {
    public static void main(String[] args) {
        String str = "a1b2c3D4E5@#";
        System.out.println(str);
        String letter = "";
        String other  = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>=65 && ch<=97 || ch>=97 && ch<=122){
                letter+=ch;
            }else{
                other+=ch;
            }
        }
        System.out.println(letter+other);
    }
}
