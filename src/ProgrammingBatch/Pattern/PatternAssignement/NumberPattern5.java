package ProgrammingBatch.Pattern.PatternAssignement;

public class NumberPattern5 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            int count = 0;
            while (count < i) {
                if (num == 1) {
                    System.out.print(num + " ");
                    count++;
                } else if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
