package Strings;

public class FirstCharacterUpperCaseApproach_2 {
    public static void main(String[] args) {
        String str = "java is easy language";
        String[] arr = str.split(" ");
        String result = "";
        for(int i=0; i<arr.length; i++){
            char ch = arr[i].charAt(0);
            ch = (char)(ch-32);
            result+=ch+arr[i].substring(1)+" ";
        }
        System.out.println(result);
    }
}
