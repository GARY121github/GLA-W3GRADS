package Recursion_And_Backtracking;

public class Permutations {
    public static void main(String[] args) {
        permutation("abc", "");
    }

    static void permutation(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < que.length(); i++) {
            char choose = que.charAt(i);
            String nextQuestion = que.substring(0, i) + que.substring(i + 1);
            permutation(nextQuestion, ans + choose);
        }
    }
}
