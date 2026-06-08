package Strings;

public class ConvertString_InTo_CharacterArray {
    public static void main(String[] args) {
        String str = "Programming";
        System.out.println(str);

        char [] arr = new char[str.length()];
        for(int i=0; i<arr.length; i++){
            arr[i]=str.charAt(i);
        }
        System.out.println(arr);
    }
}
