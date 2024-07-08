package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View_199 {
    class Solution {
        int maxHeight = -1;
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            rightView(root , 0 , list);
            return list;
        }

        private void rightView(TreeNode root , int ht , List<Integer> list){
            if(root == null){
                return;
            }

            if(ht > maxHeight){
                list.add(root.val);
                maxHeight++;
            }

            rightView(root.right , ht+1 , list);
            rightView(root.left , ht+1 , list);
        }
    }
}
