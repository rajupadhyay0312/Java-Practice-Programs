package Recursion;

public class Example1 {
    static char ch = 'A';

    public static void main(String[] args) {
        System.out.println("main");
        printAlphabets();

    }

    public static void printAlphabets() {
        System.out.println(ch++ + "");
        if(ch>'Z') return;
        printAlphabets();
    }

}
