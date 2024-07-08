package Trees;

public class Symmetric_Tree_101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return isMirror(root.left , root.right);
        }

        private boolean isMirror(TreeNode root1 , TreeNode root2){
            if(root1 == null && root2 == null){
                return true;
            }

            if(root1 == null || root2 == null){
                return false;
            }

            if(root1.val != root2.val){
                return false;
            }

            boolean f1 = isMirror(root1.left , root2.right);
            boolean f2 = isMirror(root1.right , root2.left);

            return f1 && f2;
        }
    }
}
