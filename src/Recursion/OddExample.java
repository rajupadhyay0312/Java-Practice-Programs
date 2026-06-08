package Recursion;

public class OddExample {
    static int num = 100;
    public static void main(String[] args){
        printOddNumber();
    }
    public static void printOddNumber(){
        if(num % 2 == 1){
            System.out.println("Odd : "+num);
        }
        num--;

        if(num<1) return;
        printOddNumber();
    }
}
