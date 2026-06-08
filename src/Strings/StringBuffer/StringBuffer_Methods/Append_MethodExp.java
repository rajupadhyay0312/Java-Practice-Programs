package Strings.StringBuffer.StringBuffer_Methods;

public class Append_MethodExp {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("String");
        sb.append(new int[]{1,2,3,5});
        sb.append(new char[]{'a','b','c','d'});
        sb.append(false);
        sb.append(123.123);
        sb.append(12.123633f);
        sb.append(123L);
        sb.append('Z');
        System.out.print(sb);
    }
}
