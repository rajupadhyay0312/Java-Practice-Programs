package Strings.StringBuffer;

public class StringBuffer_NoArg_Constructor_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("length:"+sb.length());
        System.out.println("capacity:"+sb.capacity());

        sb.append("12345678901234561");
        System.out.println("length: "+sb.length());
        System.out.println("capacity: "+sb.capacity());
    }
}
