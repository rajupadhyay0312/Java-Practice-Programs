package Strings.LeetCodeProblem;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        String str = "LVIII";
        System.out.println(romanToInt(str));
    }
    public static int romanToInt(String str){
        int sum=0;
        int prev=0;
        for(int i=str.length()-1;i>=0;i--){
            int curr = value(str.charAt(i));
            if(curr<prev){
                sum-=curr;
            }else{
                sum+=curr;
            }
            prev=curr;
        }
        return sum;
    }
    public static int value(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        if(ch=='M') return 1000;
        return 0;
    }
}
