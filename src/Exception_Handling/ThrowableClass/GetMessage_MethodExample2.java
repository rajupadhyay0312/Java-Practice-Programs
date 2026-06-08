package Exception_Handling.ThrowableClass;

import java.util.EmptyStackException;
import java.util.Stack;

public class GetMessage_MethodExample2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try{
            System.out.println(stack.pop());
        }
        catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }
    }
}
