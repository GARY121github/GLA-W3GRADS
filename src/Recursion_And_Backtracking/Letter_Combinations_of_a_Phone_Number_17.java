package Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number_17 {
    public static void main(String[] args) {

    }
    String[] tel = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0){
            return list;
        }
        phoneNumbers(digits , "" , list);
        return list;
    }
    public void phoneNumbers(String digits , String ans , List<String> list){
        if(digits.length() == 0){
            list.add(ans);
            return;
        }

        int dig = digits.charAt(0) - '0';
        String curr = tel[dig];

        for(int i = 0 ; i < curr.length() ; i++){
            char choose = curr.charAt(i);
            phoneNumbers(digits.substring(1) , ans + choose , list);
        }
    }
}
