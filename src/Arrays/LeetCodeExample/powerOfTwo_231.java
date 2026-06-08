package Arrays.LeetCodeExample;

public class powerOfTwo_231 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    public static  boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}
