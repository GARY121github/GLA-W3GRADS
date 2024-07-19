package DP;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum_Non_Overlapping_Bridges {

    static class Pair{
        int n;
        int s;
        public Pair(int n , int s){
            this.n = n;
            this.s = s;
        }
    }
    public static void main(String[] args) {
        Pair[] arr = new Pair[9];
        Pair ob = new Pair(8 , 6);
        arr[0] = ob;
        ob = new Pair(6 , 4);
        arr[1] = ob;
        ob = new Pair(1 , 1);
        arr[2] = ob;
        ob = new Pair(1 , 2);
        arr[3] = ob;
        ob = new Pair(2 , 5);
        arr[4] = ob;
        ob = new Pair(1 , 3);
        arr[5] = ob;
        ob = new Pair(4 , 7);
        arr[6] = ob;
        ob = new Pair(7 , 5);
        arr[7] = ob;
        ob = new Pair(5 , 3);
        arr[8] = ob;
        max_nonoverlapping(arr);
    }

    private static int max_nonoverlapping(Pair[] arr){
//        Arrays.sort(arr, new Comparator<Pair>() {
//            @Override
//            public int compare(Pair o1, Pair o2) {
//                return o1.n - o2.n;
//            }
//        });

        Arrays.sort(arr , (a , b) -> a.n - b.n);

        int[] dp = new int[arr.length];
        Arrays.fill(dp , 1);
        for(int i = 1 ; i < dp.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j].s <= arr[i].s) {
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


}
