package OOPS.Interface;

@FunctionalInterface
interface Demo2 {
    boolean isPalindrome(String str);
}
public class StringPalindrome_lambdaExp {
    public static void main(String[] args) {
       Demo2 obj = str -> isPalindrome(str);
       Demo2 obj1 = str->{
           String rev="";
           for(int i=0; i<str.length(); i++){
               rev = str.charAt(i)+rev;
           }
           return str.equals(rev);
       };
        System.out.println(obj1.isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String str){
        String rev="";
        for(int i=0; i<str.length(); i++){
            rev =str.charAt(i) + rev;
        }
        return str.equals(rev);
    }
}
