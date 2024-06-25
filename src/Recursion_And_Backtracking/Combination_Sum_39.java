package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_39 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(candidates , target , 0 , list , ans);
        return ans;
    }

    private void combinationSum(int[] arr , int target , int index , List<Integer> list , List<List<Integer>> ans){
        if(target < 0 || index == arr.length){
            return;
        }

        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        // choose
        list.add(arr[index]);
        combinationSum(arr , target - arr[index] , index , list , ans);
        list.remove(list.size() - 1);

        // not choose
        combinationSum(arr , target , index + 1 , list , ans);
    }
}
