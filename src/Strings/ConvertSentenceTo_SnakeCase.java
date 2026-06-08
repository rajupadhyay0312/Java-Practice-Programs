package Strings;

public class ConvertSentenceTo_SnakeCase {
    public static void main(String[] args) {
        String str = "Java Is Difficult";
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch==' ')
                result+='_';
            else if(ch>=65 && ch<=90)
                result+= (char)(ch+32);
            else
                result+=ch;
        }
        System.out.println(result);
    }
}
