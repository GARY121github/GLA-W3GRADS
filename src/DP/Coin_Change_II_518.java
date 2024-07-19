package DP;

import java.util.Arrays;

public class Coin_Change_II_518 {
    public static void main(String[] args) {

    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length];
        for (int[] arr : dp){
            Arrays.fill(arr , -1);
        }
        return change(amount , coins , coins.length - 1 , dp);
    }
    public static int change(int target, int[] coins , int index , int[][] dp) {
        if(target == 0){
            return 1;
        }

        if(index == -1){
            return 0;
        }

        if(dp[target][index] != -1){
            return dp[target][index];
        }
        int pick , not_pick;
        pick = not_pick = 0;

        if(coins[index] <= target){
            pick = change(target - coins[index] ,
                    coins , index , dp); // [target - coin[i]][index]
        }

        not_pick = change(target , coins , index - 1 , dp);// [target][index-1]

        return dp[target][index] = pick + not_pick;
    }
    private static int tabulation(int[] coins , int target){
        int[][] dp = new int[target+1][coins.length + 1];
        Arrays.fill(dp[0] , 1);
        for(int amount = 1 ; amount <= target ; amount++){
            for(int j = 1 ; j <= coins.length ; j++){
                int coin = coins[j - 1];
                int pick , not_pick;
                pick = not_pick = 0;
                if(coin <= amount){
                    pick = dp[amount - coin][j];// [target - coin[i]][index]
                }
                not_pick = dp[amount][j-1]; // [target][index-1]

                dp[amount][j] = pick + not_pick;
            }
        }
        return dp[target][dp[0].length-1];
    }
}
