package Recursion;

public class EvenExample {

    public static void main(String[] args){
    printEvenNumber(1,100);
    }
    public static void printEvenNumber(int num1, int num2){
        if(num1 % 2 == 0){
            System.out.print(num1+" ");
        }
        num1++;
        if(num1>num2) return;
        printEvenNumber(num1,num2);
    }
}
