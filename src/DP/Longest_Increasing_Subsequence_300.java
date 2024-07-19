package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Increasing_Subsequence_300 {
    public static void main(String[] args) {

    }

    public int LIS(int[] arr){
        int[] dp = new int[arr.length];
        Arrays.fill(dp , 1);
        for(int i = 1 ; i < dp.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
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

    private int LIS_OPTIMISED(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > list.get(list.size() - 1)){
                list.add(arr[i]);
            }
            else{
                int index = binarySearch(list , arr[i]);
                list.set(index , arr[i]);
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
