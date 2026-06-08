package Arrays.Day3_11_02_26;

import java.util.*;
public class MergeTwo_1DArrayExample {
    public static void main(String[] args) {
        int [] a = {10,20,30,40};
        int [] b = {50,60,70,80,90};
        int [] c = new int[a.length+b.length];
        for(int i=0,j=0; i<c.length; i++){
            if(i<a.length){
                c[i]=a[i];
            }else{
                c[i]=b[j++];
            }
        }
        System.out.println("Merging two arrays in new single array: ");
        System.out.println(Arrays.toString(c));
    }
}
