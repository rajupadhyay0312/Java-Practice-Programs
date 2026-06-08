package Arrays.Day3_11_02_26;
import java.util.*;
public class MergeTwo_1DZigZagMergeExp {
    public static void main(String[] args) {
        int [] a ={10,20,30};
        int [] b ={40,50,60,70};
        int max = a.length>b.length?a.length:b.length;
        System.out.println("Largest Size of Array b/w a & b : "+max);
        int [] c =new int[a.length+b.length];

        for(int i=0,j=0; i<max; i++) {
            if (i < a.length) c[j++] = a[i];
            if (i < b.length) c[j++] = b[i];
        }
        System.out.println("Arrays a and b merge in c:");
        System.out.println(Arrays.toString(c));
    }
}
