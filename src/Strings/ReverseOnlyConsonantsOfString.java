package Strings;

public class ReverseOnlyConsonantsOfString {
    public static void main(String[] args) {
        String str = "programming";
        char [] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(isVowel(arr[i]) || arr[i]==' '){
                i++;
            }else if(isVowel(arr[j]) || arr[j]==' '){
                j--;
            }else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(arr));//convert arr back to String
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
