package Strings.StringBuffer;
import java.util.Arrays;
class UserStringBuffer{
    private final int INITIAL_CAPACITY = 16;
    private char[] values;
    private int indx;

    public UserStringBuffer(){
        values = new char[INITIAL_CAPACITY];
    }
    public UserStringBuffer(int capacity){
        values = new char[capacity];
    }
    public UserStringBuffer(String str){
        values = new char[INITIAL_CAPACITY+str.length()];
        for(int i = 0;i<str.length();i++){
            values[indx] = str.charAt(i);
            indx++;
        }
    }
    @Override
    public String toString(){
        if(indx==0) return "";
        String op = "";
        for(int i =0;i<indx;i++){
            op+=values[i];
        }
        return op;
    }
    public int length(){
        return indx;
    }
    public int capacity(){
        return values.length;
    }

    public UserStringBuffer append(String str){
        if(length()+str.length()>=capacity()){
            char [] newArr = new char[calculateCapacity(capacity())];
            int i =0;
            for(;i<this.indx;i++){
                newArr[i] =this.values[i];
            }
            for(int  j = 0;j<str.length();j++){
                newArr[i] = str.charAt(j);
                indx++;
            }
            this.values = newArr;
        }
        else{
            for(int i =0;i<str.length();i++){
                values[indx++] = str.charAt(i);
            }
        }
        return this;
    }
    public int calculateCapacity(int oldCap){
        return oldCap*2+2;
    }
    public void trimToSize(){
        char[] newArr = new char[length()];
        for(int i = 0;i<length();i++){
            newArr[i]= this.values[i];
        }
        this.values = newArr;
    }
    public void ensureCapacity(int newCap){
        if(newCap<0)throw new StringIndexOutOfBoundsException("new capacity is invalid");
        if(newCap<capacity())return;
        char[] newArr = new char[newCap];
        for(int i =0;i<length();i++){
            newArr[i] = this.values[i];
        }
        this.values = newArr;
    }
}
public class StringBuffer_Method_Implementation {
    public static void main(String[] args) {
        System.out.println("----------- no args -----------");
        UserStringBuffer sb1 = new UserStringBuffer();
        System.out.println(sb1);
        System.out.println("Length :"+sb1.length());
        System.out.println("capacity :"+sb1.capacity());

        System.out.println("------capacity declaration-----");
       UserStringBuffer sb2 = new UserStringBuffer(5);
        System.out.println(sb2);
        System.out.println("Length :"+sb2.length());
        System.out.println("capacity :"+sb2.capacity());

       System.out.println("___________appending the char______");
       // sb2.append("first the capacity is 5 now we check");
        System.out.println(sb2);
        System.out.println("Length :"+sb2.length());
        System.out.println("capacity :"+sb2.capacity());


        System.out.println("-----------args-----------");
        UserStringBuffer sb = new UserStringBuffer("Hello my name is java");
        System.out.println(sb);
        System.out.println("Length :"+sb.length());
        System.out.println("capacity :"+sb.capacity());

        sb.append(" and it is very easy to learn");
        System.out.println(sb);
        System.out.println("Length :"+sb.length());
        System.out.println("capacity :"+sb.capacity());
    }
}
