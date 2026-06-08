package Strings.StringBuffer.StringBuffer_Methods;

public class Capacity_MethodExp {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1 capacity: "+sb1.capacity());

        StringBuffer sb2 = new StringBuffer("12345ABCDE");
        System.out.println("sb2 capacity: "+sb2.capacity());

        StringBuffer sb3 = new StringBuffer(10);
        System.out.println("sb3 capacity: "+sb3.capacity());
        sb3.append("123456789012345678901234567");
        System.out.println("sb3 capacity: "+sb3.capacity());

        StringBuffer sb4 = new StringBuffer(5);
        System.out.println("sb4 capacity: "+sb4.capacity());
        sb4.ensureCapacity(13);
        System.out.println("sb4 Capacity:"+sb4.capacity());
    }
}
