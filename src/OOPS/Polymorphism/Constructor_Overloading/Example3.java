package OOPS.Polymorphism.Constructor_Overloading;

import java.util.Arrays;

class MyString{
    private char [] arr;

    public MyString(){
        arr = new char[0];
    }
    public MyString(String str){
        arr = new char[str.length()];
        for(int i=0; i<arr.length;i++){
            arr[i]=str.charAt(i);
        }
    }

    @Override
    public String toString() {
        return new String(arr);
    }
}
public class Example3 {
    public static void main(String[] args) {
        MyString str1 = new MyString();
        System.out.println(str1);

        MyString str2 = new MyString("HELLO JAVA");
        System.out.println(str2);

    }
}
