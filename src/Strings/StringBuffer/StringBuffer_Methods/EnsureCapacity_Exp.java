package Strings.StringBuffer.StringBuffer_Methods;

public class EnsureCapacity_Exp {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("capacity: "+sb1.capacity());
        sb1.ensureCapacity(20);
        System.out.println("capacity: "+sb1.capacity());
    }
}
