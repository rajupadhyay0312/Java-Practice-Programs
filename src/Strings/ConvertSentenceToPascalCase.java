package Strings;

public class ConvertSentenceToPascalCase {
    public static void main(String[] args) {
        String str ="java is very danger";
        System.out.println(str);
        String result = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch==' ') continue;
            if(i==0 || str.charAt(i-1)==' ') {
                if ((ch >= 'a' && ch <= 'z')) {
                    ch = (char) (ch - 32);
                }
            }
            result+=ch;
        }
        System.out.println(result);
    }
}
