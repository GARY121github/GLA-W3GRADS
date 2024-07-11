package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams_49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String , List<String>> map = new HashMap<>();
            for (String word : strs){
                String hash = hashingFunction(word);
                if(map.containsKey(hash)){
                    map.get(hash).add(word);
                }
                else {
                    map.put(hash , new ArrayList<>());
                    map.get(hash).add(word);
                }
            }

            List<List<String>> list = new ArrayList<>();
            for (String key : map.keySet()){
                list.add(map.get(key));
            }

            return list;
        }

        private String hashingFunction(String word){
            int[] arr = new int[26];
            for (int i = 0 ; i < word.length() ; i++){
                arr[word.charAt(i) - 'a']++;
            }
            String hash = "";
            for (int i : arr){
                hash = hash + i + " ";
            }

            return hash;
        }
    }
}
