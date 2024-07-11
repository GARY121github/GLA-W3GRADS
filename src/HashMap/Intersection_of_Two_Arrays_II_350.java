package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II_350 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i : nums1){
                map.put(i , map.getOrDefault(i , 0) + 1);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : nums2){
                if(map.containsKey(i)){
                    list.add(i);
                    map.put(i , map.get(i) - 1);
                    if(map.get(i) == 0){
                        map.remove(i);
                    }
                }
            }

            int[] arr = new int[list.size()];
            for (int i = 0 ; i < list.size() ; i++){
                arr[i] = list.get(i);
            }

            return arr;
        }
    }
}
