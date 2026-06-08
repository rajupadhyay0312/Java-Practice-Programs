package Arrays.Day5_13_02_26;

public class DuplicateWithInKIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int k = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (j - i) <= k) {
                     found = true;
                     break;
                }
            }
            if(found) break;
        }
        System.out.println("Duplicate within K index : "+found);
    }
}
