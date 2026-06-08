package Strings;

public class ConvertWordFirstCharacterToUpperCase {
    public static void main(String[] args) {
        String str = "java is  easy";
        System.out.println(str);
        convertEachFirstWordUpperCase(str);
    }
    public static void convertEachFirstWordUpperCase(String str){
        String resp = "";
        for(int i=0;i<str.length();i++){
            char ch  =  str.charAt(i);
            if(i==0 || str.charAt(i-1)==' '){
                if(ch>='a' && ch<='z'){
                    ch = (char)(ch-32);
                }
            }
            resp+=ch;
        }
        System.out.println(resp);
    }
}
