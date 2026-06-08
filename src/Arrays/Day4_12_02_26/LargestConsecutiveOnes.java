package Arrays.Day4_12_02_26;

public class LargestConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr ={1,0,1,1,0,1,1,1,1};
        int max =0,cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
            }else {
                max = Math.max(max,cnt);
                cnt=0;
            }
        }
        max = max<cnt?cnt:max;
        System.out.println(max);
    }
}
