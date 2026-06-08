package Arrays.Day5_13_02_26;

import java.util.Arrays;

public class FrequencyOfElementExp1 {
    public static void main(String[] args) {
        int [] arr = {4,1,2,5,6,7,8,2,4,8,11};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        boolean[] b =new boolean[arr.length];

        for(int i=0; i<arr.length; i++){
            if(b[i]) continue;
            int cnt = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    b[j] = true;
                }
            }
//            System.out.println(arr[i]+" : "+cnt); //Frequency
//            System.out.print(arr[i]+" "); // Distinct
            //unique
//            if(cnt==1)
//                System.out.print(arr[i]+" ");

            //duplicate
            if(cnt>1)
               System.out.print(arr[i]+" ");

        }
    }
}
