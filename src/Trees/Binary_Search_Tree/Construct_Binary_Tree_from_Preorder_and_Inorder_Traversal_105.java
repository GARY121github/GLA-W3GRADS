package Trees.Binary_Search_Tree;
import Trees.TreeNode;
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105 {
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return createTree(preorder , 0 , preorder.length-1 , inorder , 0 , inorder.length - 1);
        }
        private TreeNode createTree(int[] pre , int start_pre , int end_pre , int[] in , int start_in , int end_in){
            if(start_pre > end_pre || start_in > end_in){
                return null;
            }

            TreeNode node = new TreeNode(pre[start_pre]);
            int index = serchInInorder(in , start_in , end_in , pre[start_pre]);
            int leftChilds = index - start_in;
            int rightChilds = end_in - index;

            node.left = createTree(pre , start_pre + 1 , start_pre + leftChilds , in , start_in , index-1);
            node.right = createTree(pre , start_pre + leftChilds + 1 , end_pre , in , index + 1 , end_in);

            return node;
        }
        private int serchInInorder(int[] arr , int s , int e , int target){
            for(int i = s ; i <= e ; i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
        }
    }
}
