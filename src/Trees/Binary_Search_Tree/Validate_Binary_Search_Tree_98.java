package Trees.Binary_Search_Tree;

import Trees.TreeNode;

public class Validate_Binary_Search_Tree_98 {
    class Solution {
        class Pair{
            boolean isBST = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
        }
        public boolean isValidBST(TreeNode root) {
            return isValid(root).isBST;
        }

        private Pair isValid(TreeNode root){
            if(root == null){
                return new Pair();
            }

            Pair left = isValid(root.left);
            Pair right = isValid(root.right);

            Pair self = new Pair();
            if(left.isBST && right.isBST && left.max < root.val && root.val < right.min){

                self.min = Math.min(left.min , root.val); // 10^18
                self.max = Math.max(right.max , root.val); // -10^18

                return self;
            }

            self.isBST = false;
            return self;
        }
    }
}