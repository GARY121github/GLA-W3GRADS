package DP;

public class House_Robber_198 {
    public static void main(String[] args) {

    }

    public int maxMoney(int[] house , int index , int[] dp){
        if(index < 0){
            return 0;
        }

        if(dp[index] != 0){
            return dp[index];
        }

        int choose = house[index] + maxMoney(house , index - 2 , dp); // index - 2
        int not_choose = maxMoney(house , index - 1 , dp); // index - 1

        return dp[index] = Math.max(choose , not_choose);
    }

    public int tabulation(int[] house){
        int[] dp = new int[house.length + 1];
        dp[0] = 0;
        for (int i = 1 ; i <= house.length ; i++){
            int choose = house[i - 1];
            if(i >= 2){
                choose += dp[i-2];
            }
            int not_choose = dp[i - 1];

            dp[i] = Math.max(choose , not_choose);
        }

        return dp[house.length];
    }
}
