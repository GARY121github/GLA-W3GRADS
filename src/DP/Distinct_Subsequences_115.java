package DP;

import java.util.Arrays;

public class Distinct_Subsequences_115 {
    public static void main(String[] args) {

    }
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for(int[] arr : dp){
            Arrays.fill(arr , -1);
        }
        return ways(s , 0 , t , 0 , dp);
    }

    public int ways(String question , int i , String target , int j , int[][] dp){
        if(j == target.length()){
            return 1;
        }

        if(i == question.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int pick , not_pick;
        pick = not_pick = 0;
        if(question.charAt(i) == target.charAt(j)){
            pick = ways(question , i + 1 , target , j + 1 , dp);
            not_pick = ways(question , i + 1 , target , j , dp);
        }
        else{
            not_pick = ways(question , i + 1 , target , j , dp);
        }

        return dp[i][j] = pick + not_pick;
    }
}
