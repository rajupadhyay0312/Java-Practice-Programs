package Arrays.LeetCodeExample;

public class ContainDuplicate2 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr,3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length && Math.abs(i-j)<=k; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
