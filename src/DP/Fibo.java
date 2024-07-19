package DP;

public class Fibo {
    public static void main(String[] args) {

    }

    public int fibo(int n , int[] dp){
        if(n == 0 || n == 1){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        int n_1 = fibo(n-1 ,dp);
        int n_2 = fibo(n-2 , dp);

        return dp[n] = n_1 + n_2;
    }

    public int tabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2 ; i<= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
