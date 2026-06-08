package Arrays.LeetCodeExample;

public class HappyNumber {
    public static void main(String[] args) {
       int n = 19;
        if(isHappy(n)){
            System.out.println(n+" Happy number");
        }else{
            System.out.println(n+" Not happy");
        }
    }
    public static boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        while(n!=1 && n!=4){
            int sum = 0;
            while(n!=0){
                sum += (n%10)*(n%10);
                n/=10;
            }
            if(sum==1) return true;
            n=sum;
        }
        return false;
    }
}
