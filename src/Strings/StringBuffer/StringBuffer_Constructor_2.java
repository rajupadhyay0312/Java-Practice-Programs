package Strings.StringBuffer;

public class StringBuffer_Constructor_2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(-1);
        StringBuffer sb2 = new StringBuffer(0);
        StringBuffer sb3 = new StringBuffer(10);

        System.out.println("Capacity: "+sb3.capacity());
        sb1.append("12345678910111213");
        System.out.println(sb1.capacity());

        StringBuffer sb4 = new StringBuffer(5);
        System.out.println(sb4.capacity());
        sb4.append("123456789012345");
        System.out.println(sb4.capacity());
        sb4.append("1");
        System.out.println(sb4.capacity());
    }
}
