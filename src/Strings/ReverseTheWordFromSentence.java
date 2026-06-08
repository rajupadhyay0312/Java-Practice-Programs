package Strings;

public class ReverseTheWordFromSentence {
    public static void main(String[] args) {
        String str  = "Java is easy";
        System.out.println(str);
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
