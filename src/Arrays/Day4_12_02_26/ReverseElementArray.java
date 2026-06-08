package Arrays.Day4_12_02_26;

public class ReverseElementArray {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nReverse Array: ");
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int rev = 0;

            while(num>0){
                rev=rev*10+num%10;
                num/=10;
            }
            System.out.print(rev+" ");
        }
    }
}
