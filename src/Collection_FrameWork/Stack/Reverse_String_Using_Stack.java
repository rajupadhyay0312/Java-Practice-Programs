package Collection_FrameWork.Stack;

import java.util.Stack;

public class Reverse_String_Using_Stack {
    public static String reverseStack(String str){
        Stack<Character> s = new Stack<>();
        int index  = 0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abcde";
        String result = reverseStack(str);
        System.out.println("Reverse String Using Stack: "+result);
    }
}
