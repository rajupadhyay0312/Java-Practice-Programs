package Recursion;

public class Factor {
    public static void main(String[] args) {
        findFactors(6, 1);
    }

    public static void findFactors(int num, int i) {
        if (num % i == 0)
            System.out.print(i + " ");
        i++;

        if (i > num) return;
        findFactors(num, i);
    }
}
