package Arrays;

public class AnonymousArrayExample1 {
    public static void main(String[] args) {
        isPalindrome(new String[]{"nayan","racecar","ramesh"});
    }
    public static void isPalindrome(String[] arr){

        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            String rev = "";
               for(int j=0; j<str.length();j++){
                   rev = str.charAt(j)+rev;
               }
            if(rev.equals(str)){
                System.out.println(str+" is palindrome");
            }
        }
    }
}
