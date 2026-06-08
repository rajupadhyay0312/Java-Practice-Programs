package Strings.StringBuffer;

public class ReverseWord_In_String {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello my name is Ramesh");
        String str = new String(sb);
        reverse(str);
    }
    public static void reverse(String str){
        String[] arr = str.split(" ");
        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            String rev = "";
            for(int j=0; j<word.length(); j++){
                rev = word.charAt(j)+rev;
            }
            System.out.print(rev+" ");
        }
    }
}
