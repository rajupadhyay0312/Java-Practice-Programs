package Arrays;

public class AnonymousArrayExample2 {
    public static void main(String[] args) {
        evenOdd(new int[]{1,2,3,4,5,6,7,8});
    }
    public static void evenOdd(int[] arr){
        for(int ele : arr){
            if(ele%2==0){
                System.out.println(ele+" is even");
            }
        }
    }
}
