package DP;

public class Edit_Distance_72 {
    public static void main(String[] args) {

    }
    public int minDistance(String word1, String word2) {
        return editDistance(word1 , 0 , word2 , 0);
    }
    private int editDistance(String s1 , int i , String s2 , int j){
        if(i == s1.length()){
            return s2.length() - j;
        }

        if(j == s2.length()){
            return s1.length() - i;
        }
        int ans = Integer.MAX_VALUE;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = editDistance(s1 , i+1 , s2 , j+1);
        }
        else{
            int insertion = editDistance(s1 , i , s2 , j+1);
            int deletion = editDistance(s1 , i+1 , s2 , j);
            int replace = editDistance(s1 , i+1 , s2 , j+1);

            ans = Math.min(insertion , Math.min(deletion , replace)) + 1;
        }

        return ans;
    }
}
