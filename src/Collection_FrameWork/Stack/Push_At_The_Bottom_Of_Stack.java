package Collection_FrameWork.Stack;

import java.util.Stack;

public class Push_At_The_Bottom_Of_Stack {
    public static void bottomAtStack(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        bottomAtStack(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        bottomAtStack(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
