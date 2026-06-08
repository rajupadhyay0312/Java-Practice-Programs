package ZTab_Practice;

import java.util.Scanner;
public class DriverExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.println(duplicateCharacter(str));

    }
    public static String duplicateCharacter(String str){
        char[] arr = new char[str.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        boolean[] bp = new boolean[arr.length];
        String op="";
        for(int i=0; i<arr.length; i++){
            if(bp[i]) continue;
            int cnt = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                    bp[j] = true;
                }
            }
            if(cnt==1){
                op+=arr[i]+" ";
            }
        }
        return op;
    }
}