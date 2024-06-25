package Recursion_And_Backtracking;

public class Word_Search_79 {
    public static void main(String[] args) {

    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length; j++){
                boolean is = isPresent(board , word , i , j , 0);
                if(is){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isPresent(char[][] maze , String target , int i , int j , int index){
        if(index == target.length()){
            return true;
        }

        if(i == -1 || j == -1 || i == maze.length
                || j == maze[0].length || maze[i][j] == '&'
                || maze[i][j] != target.charAt(index) ){
            return false;
        }

        int[] row = {-1 , 0 , 1 , 0};
        int[] col = {0 , 1 , 0 , -1};

        char temp = maze[i][j];
        // boolean present = false;
        maze[i][j] = '&';
        for(int k = 0 ; k < row.length ; k++){
            boolean present = isPresent(maze , target ,
                    i + row[k] , j + col[k] , index + 1);

            if(present){
                return true;
                // break;
            }
        }

        maze[i][j] = temp;

        return false;
    }
}
