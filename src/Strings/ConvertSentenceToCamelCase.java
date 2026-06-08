package Strings;

public class ConvertSentenceToCamelCase {
    public static void main(String[] args) {
        String str = "java is difficult";
        System.out.println(str);
        String result ="";
        for(int i=0; i<str.length(); i++){
            char ch  = str.charAt(i);

            if(ch==' ') {
                i++;
                ch = str.charAt(i);
                if (ch >= 97 && ch <= 122) {
                    ch = (char) (ch - 32);
                }
            }
            result+=ch;
        }
        System.out.println(result);
    }
}
