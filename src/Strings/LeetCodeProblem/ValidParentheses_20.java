package Strings.LeetCodeProblem;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='(' || ch=='['|| ch=='{'){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()) return false;
            char ch1 = stack.peek();
            if(ch1=='(' && ch==')') stack.pop();
            else if(ch1=='['&& ch==']') stack.pop();
            else if(ch1=='{'&& ch=='}') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
