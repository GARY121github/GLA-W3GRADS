package Trees.Binary_Search_Tree;

import Trees.TreeNode;

public class Validate_Binary_Search_Tree_98 {
    class Solution {
        class Pair{
            boolean isValid;
            long max;
            long min;
            public Pair(){
                isValid = true;
                max = Long.MIN_VALUE;
                min = Long.MAX_VALUE;
            }
        }
        public boolean isValidBST(TreeNode root) {
            return isValidbst(root).isValid;
        }

        private Pair isValidbst(TreeNode root){
            if(root == null){
                return new Pair();
            }

            Pair left = isValidbst(root.left);
            Pair right = isValidbst(root.right);

            Pair self = new Pair();
            if(left.isValid && right.isValid && left.max < root.val && root.val < right.min){
                self.isValid = true;
                self.max = Math.max(root.val , right.max);
                self.min = Math.min(root.val , left.min);
            }
            else{
                self.isValid = false;
            }
            return self;
        }
    }
}