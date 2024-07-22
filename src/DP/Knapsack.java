package DP;

import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        int[] wt = {3 , 2 , 5};
        int[] value = {20 , 40 , 50};
        int maxCapacity = 6;
        int[][] dp = new int[wt.length][maxCapacity + 1];
        for(int[] arr : dp){
            Arrays.fill(arr , -1);
        }
    }
    private static int knapsack01(int[] wt , int[] val ,
                                  int index , int k , int[][] dp){
        if(index == -1){
            return 0;
        }

        if(dp[index][k] != -1){
            return dp[index][k];
        }

        int pick , not_pick;
        pick = not_pick = 0;

        if(wt[index] <= k){
            pick = knapsack01(wt , val ,
                    index - 1 , k - wt[index]
                    , dp) + val[index]; //[index-1][k - wt[index]]
        }

        not_pick = knapsack01(wt , val , index - 1 , k , dp);
        return dp[index][k] = Math.max(pick , not_pick);
    }

    private int tabulation(int[] wt , int[] val , int cap){
        int[][] dp = new int[wt.length + 1][cap + 1];
        for(int i = 1 ; i < dp.length ; i++){
            for(int k = 1 ; k <= cap ; k++){
                int pick , not_pick;
                pick = not_pick = 0;
                //[index-1][k - wt[index]]'
                int index = i - 1;
                if(wt[index] <= k){
                    int w = wt[index];
                    pick = dp[i - 1][k - w] + val[index];
                }
                not_pick = dp[i-1][k];

                dp[i][k] = Math.max(pick , not_pick);

            }
        }

        return dp[wt.length][cap];
    }
}
