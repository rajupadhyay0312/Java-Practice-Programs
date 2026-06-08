package Strings.StringBuffer.StringBuffer_Methods;

public class Reverse_MethodExp {
    public static void main(String[] args) {
        String str = "Hello my name is Ramesh";
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();

        for(String ele : arr){
            sb.append(new StringBuffer(ele).reverse());
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
