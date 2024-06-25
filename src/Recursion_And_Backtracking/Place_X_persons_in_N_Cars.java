package Recursion_And_Backtracking;

public class Place_X_persons_in_N_Cars {
    public static void main(String[] args) {
        boolean[] car = new boolean[4];
        int person = 2;
        Permutations(car , person,  0 , "");
    }

    static void Permutations(boolean[] board , int total , int current , String ans){
        if(current == total){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < board.length ; i++){
            if(!board[i]){
                board[i] = true;
                Permutations(board , total , current+1 , ans+" PERSON " + i + " CAR " + current );
                board[i] = false;
            }
        }
    }
}
