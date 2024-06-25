package Recursion_And_Backtracking;
import java.math.BigInteger;
import java.util.ArrayList;

public class Additive_Number_306 {

}

class Solution {

    public boolean isAdditiveNumber(String num) {
        return isAdditive(num , new ArrayList<>());
    }

    private boolean isAdditive(String number, ArrayList<BigInteger> list) {
        if (number.length() == 0) {
            // System.out.println(list);
            return list.size() >= 3;
        }

        for(int i = 1 ; i <= number.length() ; i++){
            String partition = number.substring(0 , i);
            String remain = number.substring(i);
            if(startsWithZero(partition) && isValidPartition(list , partition)){
                // long curr = Long.parseLong(partition);
                BigInteger curr = new BigInteger(partition);
                list.add(curr);
                boolean isValid = isAdditive(remain , list);
                if(isValid){
                    return true;
                }
                list.remove(list.size()-1);
            }
        }
        return false;
    }

    private boolean startsWithZero(String curr){
        if(curr.length() == 1){
            return true;
        }

        return curr.charAt(0) != '0';
    }
    private boolean isValidPartition(ArrayList<BigInteger> list, String curr) {
        if (list.size() < 2) {
            return true;
        }
        BigInteger last = list.get(list.size() - 1);
        BigInteger second_last = list.get(list.size() - 2);
        BigInteger c = new BigInteger(curr);
        // return c == last + second_last;
        return c.equals(last.add(second_last));
    }
}
