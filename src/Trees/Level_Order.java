package Trees;


import Trees.Binary_Search_Tree.BST;
import java.util.LinkedList;
import java.util.Queue;

public class Level_Order {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8};
        BST tree = new BST(arr);
        Node root = tree.getRoot();
//        levelOrder(root);
        levelOrderInLines(root);
    }

    private static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node curr = queue.remove();

            System.out.print(curr.data + " ");

            if(curr.left != null){
                queue.add(curr.left);
            }

            if(curr.right != null){
                queue.add(curr.right);
            }
        }
    }
    private static void levelOrderInLines(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node curr = queue.remove();
            if(curr == null){
                if(queue.isEmpty()){
                    break;
                }
                else {
                    System.out.println();
                    queue.add(null);
                    continue;
                }
            }

            System.out.print(curr.data + " ");

            if(curr.left != null){
                queue.add(curr.left);
            }

            if(curr.right != null){
                queue.add(curr.right);
            }
        }
    }
}
