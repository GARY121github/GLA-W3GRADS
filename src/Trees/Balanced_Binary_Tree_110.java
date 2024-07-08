package Trees;

public class Balanced_Binary_Tree_110 {
//    class Solution {
//        public boolean isBalanced(TreeNode root) {
//            if(root == null){
//                return true;
//            }
//
//            boolean left = isBalanced(root.left);
//            boolean right = isBalanced(root.right);
//
//            int height_of_left_subtree = height(root.left);
//            int height_of_right_subtree = height(root.right);
//
//            int balance_factor = Math.abs(height_of_left_subtree - height_of_right_subtree);
//
//            return left && right && balance_factor <= 1;
//
//        }
//
//        private int height(TreeNode root){
//            if(root == null){
//                return 0;
//            }
//
//            int left = height(root.left);
//            int right = height(root.right);
//
//            return Math.max(left , right) + 1;
//        }
//    }

    class Solution {
        class Pair{
            boolean isBalance = true;
            int height = 0;
        }
        public boolean isBalanced(TreeNode root) {
            return isBalance(root).isBalance;
        }
        private Pair isBalance(TreeNode root){
            if(root == null){
                return new Pair();
            }

            Pair left = isBalance(root.left);
            Pair right = isBalance(root.right);

            Pair self = new Pair();
            self.height = Math.max(left.height , right.height) + 1;

            if(left.isBalance && right.isBalance){
                int bf = Math.abs(left.height - right.height);

                if(bf >= 2){
                    self.isBalance = false;
                }

                return self;
            }

            self.isBalance = false;
            return self;
        }
    }
}