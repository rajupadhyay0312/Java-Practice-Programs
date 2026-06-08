package Arrays.Day2_10_02_26;

public class ArrayPrimeNum {
    public static void main(String[] args) {
        int [] arr = {1,2,23,3,5,7,8,9};
        System.out.print("Prime numbers: ");
        for(int ele : arr){
            if(isPrime(ele)){
                System.out.print(ele+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i<=num/2; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
