package Strings;

public class ReplaceMultipleSpace_With_SingleSpace {
    public static void main(String[] args) {
        String str = "Java    is      Easy";
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch==' '){
                result+=ch;

                while(i<str.length() && str.charAt(i+1)==' '){
                    i++;
                }
            }else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
