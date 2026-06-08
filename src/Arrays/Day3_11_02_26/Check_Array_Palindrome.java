package Arrays.Day3_11_02_26;

public class Check_Array_Palindrome {
    public static void main(String[] args) {
        int [] arr = {123,456,1331,122,121,567,1551};

        System.out.println("Palindrome from arrays are:-");
        for(int ele : arr){
            if(isPalindrome(ele)){
                System.out.print(ele+" ");
            }
        }
    }
    public static boolean isPalindrome(int num){
        int rev = 0, temp=num;
        while(num!=0){
            rev = rev*10+num%10;
            num/=10;
        }
        return temp==rev;
    }
}
