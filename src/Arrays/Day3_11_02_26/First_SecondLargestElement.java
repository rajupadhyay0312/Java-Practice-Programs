package Arrays.Day3_11_02_26;

public class First_SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int ele : arr){
           if(max1<ele){
               max2 = max1;
               max1=ele;
           }else if(max2<ele && ele !=max1){
               max2 = ele;
           }
        }
        System.out.print("\nFirst Largest  : "+max1);
        System.out.print("\nSecond Largest : "+max2);
    }

}
