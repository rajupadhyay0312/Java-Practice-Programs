package Strings.StringBuffer.StringBuffer_Methods;

public class Delete_MethodExp {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for(char ch='A'; ch<='Z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.delete(5,10);
        sb.delete(10,10);
//        sb.delete(-2,10); //Exception
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}
