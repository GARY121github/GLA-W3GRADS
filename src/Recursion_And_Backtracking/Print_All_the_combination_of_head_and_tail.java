package Recursion_And_Backtracking;

public class Print_All_the_combination_of_head_and_tail {
    public static void main(String[] args) {
        printHeadTails(3 , "");
    }

    static void printHeadTails(int n , String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        //pic head
        printHeadTails(n-1 , ans+'H');

        //pic tails
        printHeadTails(n-1 , ans+'T');
    }
}
