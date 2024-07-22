package DP;

public class Uncrossed_Lines_1035 {
    public static void main(String[] args) {

    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return tabulation(nums1 , nums2);
    }
    private int tabulation(int[] s1 , int[] s2){
        int[][] dp = new int[s1.length+1][s2.length+1];
        for(int i = 1 ; i <= s1.length ; i++){
            for (int j = 1 ; j <= s2.length ; j++){
                if(s1[i-1] == s2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    int c1 = dp[i-1][j];
                    int c2 = dp[i][j-1];
                    dp[i][j] = Math.max(c1 , c2);
                }
            }
        }

        return dp[s1.length][s2.length];
    }
}
