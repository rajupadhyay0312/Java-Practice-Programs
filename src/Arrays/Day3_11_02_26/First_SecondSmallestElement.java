package Arrays.Day3_11_02_26;

public class First_SecondSmallestElement {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int ele : arr){
            if(min1>ele){
                min2 = min1;
                min1 = ele;
            }
            else if(min2>ele && ele!=min1){
                min2 = ele;
            }
        }
        System.out.print("\nFirst  Smallest : "+min1);
        System.out.print("\nsecond Smallest : "+min2);
    }
}
