package DP;

import java.util.Arrays;

public class Longest_Common_Subsequence_1143 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] arr : dp){
            Arrays.fill(arr , -1);
        }
    }
    private static int LCS(String s1 , int i ,
                           String s2 , int j , int[][] dp){
        if(i == -1 || j == -1){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = LCS(s1 , i-1 , s2 , j-1 , dp) + 1; // [i-1][j-1]
        }else{
            int c1  = LCS(s1 , i-1 , s2 , j , dp); // [i-1][j]
            int c2 = LCS(s1 , i , s2 , j-1 , dp); // [i][j-1]

            ans = Math.max(c1 , c2);
        }

        return dp[i][j] = ans;
    }

    private int tabulation(String s1 , String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i = 1 ; i <= s1.length() ; i++){
            for (int j = 1 ; j <= s2.length() ; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    int c1 = dp[i-1][j];
                    int c2 = dp[i][j-1];
                    dp[i][j] = Math.max(c1 , c2);
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
