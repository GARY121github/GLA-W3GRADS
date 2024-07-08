package Trees.Binary_Search_Tree;


import Trees.TreeNode;

public class Insert_into_a_Binary_Search_Tree_701 {
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root == null){
                TreeNode node = new TreeNode(val);
                return node;
            }

            if(val > root.val){
                root.right = insertIntoBST(root.right , val);
            }
            else{
                root.left = insertIntoBST(root.left , val);
            }

            return root;
        }
    }
}
