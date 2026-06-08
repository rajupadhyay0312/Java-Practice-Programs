package Collection_FrameWork.Greedy_Algorithm;

import java.util.Comparator;
import java.util.Arrays;
public class Fractional_Knapsacks {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        //0th col => idx;1st col => ratio

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        double finalValue = 0;

        for(int i= ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalValue += val[idx];
                capacity -= weight[idx];
            }else{
                finalValue += ratio[i][1] * capacity;
                break;
            }
        }
        System.out.println("Maximum value = "+finalValue);
    }
}
