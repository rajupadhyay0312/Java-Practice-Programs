package Arrays.Day2_10_02_26;

import java.util.Arrays;
import java.util.Scanner;
public class FactorNumberStore_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int cnt = findCountFactors(num);
        System.out.println(num+" : "+cnt);
        int [] arr = new int[cnt];
        System.out.println("Arrays before: "+ Arrays.toString(arr));
        findFactor(num,arr);
        System.out.println("Arrays after: "+Arrays.toString(arr));
}
    public static void findFactor(int num, int [] arr){
        for(int i=1,index=0; i<=num; i++) {
            if (num % i == 0) {
                arr[index++] = i;
            }
        }
    }
    public static int findCountFactors(int num){
        int cnt = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                cnt++;
            }
        }
        return cnt;
    }
}
