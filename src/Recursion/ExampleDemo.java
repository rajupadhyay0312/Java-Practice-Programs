package Recursion;

public class ExampleDemo {
    static int num =1;
    public static void main(String[] args) {
       printNumber();
    }
    public static void printNumber(){
        System.out.println(num++ +" ");
        if(num>3)
            return;
        printNumber();
    }
}
