package Arrays.Day3_11_02_26;

public class StringPalindrome {
    public static void main(String[] args) {
        String[] arr = {"madam", "racecar", "Ramesh", "civic", "Rajesh", "hello"};
        for(int i =0; i<arr.length; i++){
            if(isPalindrome(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static boolean isPalindrome(String str){
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev = str.charAt(i)+rev;
        }
        return str.equals(rev);
    }
}
