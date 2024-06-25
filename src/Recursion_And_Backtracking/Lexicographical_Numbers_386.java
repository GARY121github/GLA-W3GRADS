package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers_386 {
    public static void main(String[] args) {
        int n =1000;
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        counting(n , 0 , ans);
        return ans;
    }

    static void counting(int maxRange , int curr , List<Integer> ans){
        if(curr > maxRange){
            return;
        }

        // print
        if(curr != 0)
            ans.add(curr);

        int start = 0;
        if(curr == 0){
            start = 1;
        }

        for(int i = start ; i <= 9 ; i++){
            counting(maxRange , curr * 10 + i , ans);
        }
    }
}
