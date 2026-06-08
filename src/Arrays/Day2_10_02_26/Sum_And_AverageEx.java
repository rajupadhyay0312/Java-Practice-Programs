package Arrays.Day2_10_02_26;

public class Sum_And_AverageEx {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8};
        int sum=0;
        for(int ele : arr){
            sum+=ele;
        }
        System.out.println("sum : "+sum);
        System.out.println("Average : "+sum/arr.length);
    }
}
