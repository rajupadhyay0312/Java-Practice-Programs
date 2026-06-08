package ConditionalOperator;

import java.util.Scanner;

public class Ternary_PrimeNum {
    public static void main(String[] arg){
        for(int i = 1; i <= 100; i++){
            int num  = i;
            String op =
                    (num == 2 || num == 3 || num == 5 || num == 7)?
                            (num+" is prime "):
                            ((num%2==0 || num%3==0 || num%5==0 || num%7==0 || num<2)?
                                    ((num+" is Not prime")):
                                    ((num%3 == 1 && num > 100)?
                                            (num+" is not prime"):
                                            (num+" is prime")));
            System.out.println(op);
        }

    }
}
