package Strings.StringBuffer.StringBuffer_Methods;

public class SetLength_Exp {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HELLLOOO");
        System.out.println(sb);
        System.out.println("sb length: "+sb.length());
        System.out.println("sb capacity: "+sb.capacity());

        System.out.println("________________");

        sb.setLength(2);
        System.out.println(sb);
        System.out.println("sb length: "+sb.length());
        System.out.println("sb capacity: "+sb.capacity());

        System.out.println("________________");

        StringBuffer sb1 = new StringBuffer("hi");
        System.out.println(sb1);
        System.out.println("sb1 length: "+sb1.length());
        System.out.println("sb1 capacity: "+sb1.capacity());

        System.out.println("________________");

        sb.setLength(10);
        System.out.println(sb1);
        System.out.println("sb1 length: "+sb1.length());
        System.out.println("sb1 capacity: "+sb1.capacity());

        System.out.println("________________");

        sb1.append("123");
        System.out.println(sb1);
        System.out.println("sb1 length: "+sb1.length());
        System.out.println("sb1 length: "+sb1.capacity());
        sb1.setLength(-2);
    }
}
