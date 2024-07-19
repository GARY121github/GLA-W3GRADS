package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class Russian_Doll_Envelopes_354 {
    class Solution {
        public int maxEnvelopes(int[][] envelopes) {
            Arrays.sort(envelopes ,
                    (a , b) -> a[0] - b[0]);
            int[] dp = new int[envelopes.length];
            Arrays.fill(dp , 1);
            for(int i = 1 ; i < dp.length ; i++) {
                for (int j = 0; j < i; j++) {
                    if (envelopes[j][0] < envelopes[i][0]
                        && envelopes[j][1] < envelopes[j][1]
                    ) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }

            int max = 1;
            for (int i : dp){
                max = Math.max(i , max);
            }
            return max;
        }

        private int LIS_OPTIMISED(int[][] arr){
            Arrays.sort(arr , (a , b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[0][1]);
            for(int i = 1 ; i < arr.length ; i++){
                int lastHeight = list.get(list.size()-1);
                if(
                        arr[i][1] > lastHeight
                ){
                    list.add(arr[i][1]);
                }
                else{
                    int index = binarySearch(list , arr[i][1]);
                    list.set(index , arr[i][1]);
                }
            }

            return list.size();
        }

        private int binarySearch(ArrayList<Integer> list , int target){
            int s = 0;
            int e = list.size()-1;
            int ans = list.size() - 1;
            while (s <= e){
                int mid = s + (e - s) / 2;
                if(list.get(mid) >= target){
                    ans = mid;
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }

            return ans;
        }
    }
}
