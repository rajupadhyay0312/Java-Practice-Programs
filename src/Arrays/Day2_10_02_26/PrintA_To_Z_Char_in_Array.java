package Arrays.Day2_10_02_26;

import java.util.Arrays;

public class PrintA_To_Z_Char_in_Array {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for(int i=0; i<arr.length;){
            char ch = (char)(Math.random()*100);
            if(ch>='A' && ch<='Z'){
                if(!check(ch,arr))
                   arr[i++] = ch;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean check(char search, char [] arr){
        for(char ele : arr)
           if(search == ele)
               return true;
        return false;
    }
}
