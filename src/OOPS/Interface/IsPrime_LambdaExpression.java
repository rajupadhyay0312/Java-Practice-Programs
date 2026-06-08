package OOPS.Interface;

//@FunctionalInterface
interface Example124{
    boolean isPrime(int num);
}
public class IsPrime_LambdaExpression {
    public static void main(String[] args) {
        Example124 obj = num->isPrime(num);
        Example124 obj1 = num-> {
            if(num<2) return false;
            for(int i=2; i<=num/2;i++)
                if(num%i==0) return false;
            return true;
        };
        int num=6;
        System.out.println(obj.isPrime(num)?num+" isPrime ":num +" is not prime");
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i<=num/2;i++)
            if(num%i==0) return false;
        return true;
    }
}
