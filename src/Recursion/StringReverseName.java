package Recursion;

public class StringReverseName {
    static String reversed = "";
    public static void main(String[] args){
        String str = "RAJ";
        reverse(str,0);
        System.out.println("Reversed String " +reversed);
    }
    public static void reverse(String str, int index){
        if(index == str.length()){
            return;
        }
        reverse(str, index+1);
        reversed += str.charAt(index);
    }
}
