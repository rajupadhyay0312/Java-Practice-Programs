package Strings.StringBuffer.StringBuffer_Methods;

public class DeleteCharAt_MethodExp {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.deleteCharAt(2);
        System.out.println(sb1);
    }
}