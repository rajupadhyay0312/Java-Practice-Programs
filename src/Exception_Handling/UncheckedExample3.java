package Exception_Handling;

import java.util.Arrays;

public class UncheckedExample3 {
    public static void main(String[] args) {
        int [] arr = null;
        try{
            arr = new int[-0];
        }
        catch(NegativeArraySizeException e){
            System.out.println("requested array size is invalid");
        }
        System.out.println(Arrays.toString(arr));
    }
}
