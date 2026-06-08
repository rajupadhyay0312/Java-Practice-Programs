package Strings;

import java.util.Arrays;

public class Constructor_Of_StringClass {
    public static void main(String[] args) {

        ///1.Public String()
//        String str = new String();
//        System.out.println(str);

        /// 2.public String(String str)
//        String str = new String("Akshay");
//        System.out.println(str);

        /// 3.public String(StringBuffer sb)
//        StringBuffer sb = new StringBuffer("Akshay");
//        System.out.println(sb);
//        String str = new String(sb);
//        System.out.println(str);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(str);

        ///4.public String(StringBuilder sb)
//        StringBuilder sb = new StringBuilder("HelloWorld");
//        System.out.println(sb);
//        String str = new String(sb);
//        System.out.println(str);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(str);

        /// 5.public String(char[] arr)

        char[] arr = {'A','K','S','H','A','Y'};
        System.out.println(Arrays.toString(arr));
        String str = new String(arr);
        System.out.println(str);

        /// 6.public String(char[] arr, int offset,int count)
//        char[] arr = {'M','A','H','A','R','A','S','T','R','A'};
//        System.out.println(Arrays.toString(arr));
//        String str = new String(arr,0,4);
//        System.out.println(str);

        /// 7.public String(byte[] arr)
//        byte[] arr = {65,107,115,104,97,121};
//        System.out.println(Arrays.toString(arr));
//        String str = new String(arr);
//        System.out.println(str);

        /// 8.public String(byte[] arr, int, int);
//        byte[] arr = {65,107,115,104,97,121};
//        System.out.println(Arrays.toString(arr));
//        String str = new String(arr,0,2);
//        System.out.println(str);
    }
}
