package Arrays.LeetCodeExample;

import java.util.Arrays;
public class BuySellStockExp1 {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(Arrays.toString(prices));
        System.out.println(buySell(prices));
    }
    public static int buySell(int [] prices){
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){

            if(buyPrice<prices[i]){

                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{

                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}
