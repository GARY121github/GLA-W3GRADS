package Trees.Binary_Search_Tree;

import Trees.TreeNode;

public class Delete_Node_in_a_BST_450 {
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root == null){
                return null;
            }

            if(key > root.val){
                root.right = deleteNode(root.right , key);
            }
            else if(key < root.val){
                root.left = deleteNode(root.left , key);
            }
            else{

                // WHEN WE 1 CHILDREN & 0 CHILDREN
                if(root.right == null){
                    return root.left;
                }
                else if(root.left == null){
                    return root.right;
                }
                else{
                    int leftMax = left_sub_tree_max(root.left);
                    root.val = leftMax;
                    root.left = deleteNode(root.left , leftMax);
                }
            }

            return root;
        }

        private int left_sub_tree_max(TreeNode root){
            if(root == null){
                return Integer.MIN_VALUE;
            }

            int right = left_sub_tree_max(root.right);
            return Math.max(right , root.val);
        }
    }
}