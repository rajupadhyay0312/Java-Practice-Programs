package Strings.StringBuffer;

public class StringBuffer_Constructor_4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("StringBuilder");
        System.out.println(sb1);
        StringBuffer sb2 = new StringBuffer(sb1);
        System.out.println(sb2);
    }
}
