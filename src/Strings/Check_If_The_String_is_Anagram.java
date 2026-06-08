package Strings;

import java.util.Arrays;

public class Check_If_The_String_is_Anagram {
    public static void main(String[] args) {
        String str1 = "poy";
        String str2 = "oyp";

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            return;
        }
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0,j=0;i<a.length;j++,i++){
            if(a[i]!=b[j]){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
