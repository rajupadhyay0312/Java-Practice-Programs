package Arrays.Day2_10_02_26;

public class ReverseNum_Using_All_Loop {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        // -------- for loop --------
        System.out.println("\nReverse Array:");
        System.out.println("for loop:-");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }
            System.out.print(rev + " ");
        }
        // -------- while loop --------
        System.out.println("\nwhile loop:-");
        int i = 0;
        while (i < arr.length) {
            int num = arr[i];
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            System.out.print(rev + " ");
            i++;
        }

        // -------- do-while loop --------
        System.out.println("\ndo-while loop:-");
        i = 0;
        do {
            int num = arr[i];
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            System.out.print(rev + " ");
            i++;
        } while (i < arr.length);
    }
}
