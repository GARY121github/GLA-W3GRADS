package Trees;
public class Flip_Equivalent_Binary_Trees_951 {
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
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            // IF BOTH ROOT ARE NULL => SYMMETRIC
            if(root1 == null && root2 == null){
                return true;
            }

            // IF ONE OF THE ROOT IS NULL => NOT SYMMETRIC
            if(root1 == null || root2 == null){
                return false;
            }

            // IF THE VALUE OF THE ROOT ARE NOT EQUAL => NOT SYMMETRIC
            if(root1.val != root2.val){
                return false;
            }

            boolean flip = flipEquiv(root1.left , root2.right) && flipEquiv(root1.right , root2.left);

            boolean noflip = flipEquiv(root1.left , root2.left) && flipEquiv(root1.right , root2.right);

            return flip || noflip;
        }
    }
}
