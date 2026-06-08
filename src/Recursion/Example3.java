package Recursion;

public class Example3 {
    static int num = 100;
    public static void main(String[] args){
      printNumber();
    }
    public static void printNumber(){
        System.out.println(num-- +"");
        if(num<1) return;
        printNumber();
    }
}
