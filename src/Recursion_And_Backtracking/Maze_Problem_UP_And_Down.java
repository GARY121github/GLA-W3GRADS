package Recursion_And_Backtracking;

public class Maze_Problem_UP_And_Down {
    public static void main(String[] args) {
        mazeProblem(0, 0, 3, "");
    }
    static void mazeProblem(int i , int j , int des , String ans){
        if(i == des-1 && j == des-1){
            System.out.println(ans);
            return;
        }

        if(i == des || j == des){
            return ;
        }

        mazeProblem(i+1, j, des, ans + "D ");
        mazeProblem(i, j+1, des, ans + "R ");
    }
}
