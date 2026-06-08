package Strings;

public class CountTheNumOfDigit_InTheString {
    public static void main(String[] args) {
        String str = "Java1238";
        countNumDigit(str);
    }
    public static void countNumDigit(String str){
        int cnt=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                cnt++;
            }
        }
        System.out.println("count of digit in the string: "+cnt);
    }
}
