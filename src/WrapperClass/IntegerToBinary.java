package WrapperClass;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        String bin = "";

        for(int i= num; i!=0; i/=2){
            int rem = i%2;
            bin = rem + bin;
        }
        System.out.println("User-Imp: "+bin);
        System.out.println("Built-In: "+Integer.toBinaryString(num));
    }
}
