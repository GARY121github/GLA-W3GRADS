package Trees.Binary_Search_Tree;
import Trees.TreeNode;
public class Maximum_Sum_BST_in_Binary_Tree_1373 {
    class Solution {
        int maxSum = 0;
        public int maxSumBST(TreeNode root) {
            isValidbst(root);
            return this.maxSum;
        }
        class Pair{
            boolean isValid;
            long max;
            long min;
            int sum;
            public Pair(){
                isValid = true;
                max = Long.MIN_VALUE;
                min = Long.MAX_VALUE;
                sum = 0;
            }
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
                self.sum = left.sum + right.sum + root.val;

                this.maxSum = Math.max(this.maxSum , self.sum);
            }
            else{
                self.isValid = false;
            }

            return self;
        }
    }
}
