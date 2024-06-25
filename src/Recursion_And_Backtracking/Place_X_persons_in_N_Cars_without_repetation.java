package Recursion_And_Backtracking;

public class Place_X_persons_in_N_Cars_without_repetation {
    public static void main(String[] args) {
        boolean[] car = new boolean[4];
        int person = 2;
        printCombinations(car , person , 0 , 0 , "");
    }

    static void printCombinations(boolean[] board , int total , int current , int index ,  String ans){
        if(current == total){
            System.out.println(ans);
            return;
        }

        for (int i = index ; i < board.length ; i++){
            if(!board[i]){
                board[i] = true;
                printCombinations(board , total , current+1 , i+1 , ans+" CAR "+ i + " PERSON " + current);
                board[i] = false;
            }
        }
    }
}
