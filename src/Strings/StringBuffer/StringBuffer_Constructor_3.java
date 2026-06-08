package Strings.StringBuffer;

public class StringBuffer_Constructor_3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abcdefghijklmnopqrstuvwxyx");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
