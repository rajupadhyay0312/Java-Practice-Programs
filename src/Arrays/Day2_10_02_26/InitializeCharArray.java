package Arrays.Day2_10_02_26;

/// Uppercase A to Z
//import java.util.Arrays;
//public class InitializeCharArray {
//    public static void main(String[] args) {
//        char[] arr = new char[26];
//        char ch = 'A';
//        for(int i=0; i<arr.length; i++){
//            arr[i]=ch++;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//-------------------------------OR--------------------------//

/// Lowercase a to z
import java.util.Arrays;
public class InitializeCharArray {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for(char i=0; i<arr.length; i++){
            arr[i] = (char)(i+97);
        }
        System.out.println(Arrays.toString(arr));
    }
}
