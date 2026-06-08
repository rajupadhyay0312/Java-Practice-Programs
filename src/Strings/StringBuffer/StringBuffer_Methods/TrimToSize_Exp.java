package Strings.StringBuffer.StringBuffer_Methods;

public class TrimToSize_Exp {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("12345678ABDEF");
        System.out.println("sb1 length: "+sb1.length());
        System.out.println("sb1 capacity: "+sb1.capacity());
        sb1.trimToSize();
        System.out.println("sb1 length: "+sb1.length());
        System.out.println("sb1 capacity: "+sb1.capacity());

        System.out.println("___________________________");

        StringBuffer sb2 = new StringBuffer("HELLO JAVA");
        System.out.println("sb2 length: "+sb2.length());
        System.out.println("sb2 capacity: "+sb2.capacity());
        sb2.trimToSize();
        System.out.println("sb2 length: "+sb2.length());
        System.out.println("sb2 capacity: "+sb2.capacity());

        System.out.println("___________________________");

        StringBuffer sb3 = new StringBuffer("HELLO JAVA");
        System.out.println("sb3 length: "+sb3.length());
        System.out.println("sb3 capacity: "+sb3.capacity());
        for(int i=1,ch='A'; i<=233; i++){
            sb3.append((char)ch++);
            if(ch=='Z') ch='A';
        }
        sb3.trimToSize();
        System.out.println("sb3 length: "+sb3.length());
        System.out.println("capacity: "+sb3.capacity());
    }
}
