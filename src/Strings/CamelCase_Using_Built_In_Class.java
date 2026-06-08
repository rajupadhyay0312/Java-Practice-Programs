package Strings;

public class CamelCase_Using_Built_In_Class {
    public static void main(String[] args) {
        String str = "java is Difficult";
        String[] arr = str.split(" ");
        String result = arr[0];

        for(int i=1; i<arr.length; i++){
            result+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
        }
        System.out.println(result);
    }
}
