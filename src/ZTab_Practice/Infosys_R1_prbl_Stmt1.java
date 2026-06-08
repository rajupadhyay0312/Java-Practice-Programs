package ZTab_Practice;

import java.util.Scanner;

public class Infosys_R1_prbl_Stmt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number items: ");
        int n = sc.nextInt(); // Number of Items
        System.out.print("Enter Number Of Bidder: ");
        int m = sc.nextInt(); // Number of Bidder

        int[] budget = new int[m];

        //Input budget
        for(int i=0; i<m; i++){
            System.out.println("Enter Budget");
            budget[i] = sc.nextInt();
        }

        int[][] bid = new int[n][m];

        //Input bids
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Enter bid: ");
                bid[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(n,m,budget,bid));
    }
    public static int solve(int n, int m, int[] budget, int[][] bid){
        boolean[] won = new boolean[m]; //track bidders who already won
        int revenue = 0;

        //process each item
        for(int item = 0; item<n; item++){
            int maxBid = -1;
            int winner = -1;

            //check every bidder
            for(int bidder=0; bidder<m; bidder++){

                //Skip if bidder already won an item
                if (won[bidder]) {
                    continue;
                }
                int currentBid = bid[item][bidder];

                //bid must be within  budget
                if(currentBid <= budget[bidder]){

                    //Higher bid Found
                    if(currentBid > maxBid){
                        maxBid = currentBid;
                        winner = bidder;
                    }
                    //Tie case -> smaller bidder index wins
                    else if(currentBid == maxBid && bidder < winner){
                        winner = bidder;
                    }
                }
            }
            //If someone won this item
            if(winner != -1){
                revenue += maxBid;
                won[winner] = true;
            }
        }
        return revenue;
    }
}
