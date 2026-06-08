package Strings;

public class ConvertTheSentence_To_kebabCase {
    public static void main(String[] args) {
        String str = "Java Is Easy";
        String result = "";

        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch==' ')
                result+='-';
            else if(ch>=65 && ch<=90)
                result+=(char)(ch+32);
            else
                result+=ch;
        }
        System.out.println(result);
    }
}

//public class ConvertTheSentence_To_kebabCase {
//    public static void main(String[] args) {
//        String str = "Java Is Easy";
//        System.out.println(str.toLowerCase().replace(' ','-'));
//    }
//}
