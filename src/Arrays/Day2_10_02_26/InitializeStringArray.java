package Arrays.Day2_10_02_26;

//import java.util.Arrays;
//public class InitializeStringArray {
//    public static void main(String[] args) {
//        String[] arr = new String[26];
//        System.out.println(Arrays.toString(arr));
//
//        for(char ch ='A';ch<='Z'; ch++){
//            arr[ch-65] = ""+ ch +(char)(ch+32);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//---------------------------OR------------------------------//
import java.util.Arrays;
public class InitializeStringArray {
    public static void main(String[] args) {
        String[] arr = new String[26];
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            arr[i] = ""+(char)(i+65)+(char)(i+97);
        }
        System.out.println(Arrays.toString(arr));
    }
}
