package Trees.Binary_Search_Tree;

import Trees.Node;

public class BST {

    private Node root;

    public BST(int[] arr){
        this.root = createTree(arr , 0 , arr.length - 1);
    }

    private Node createTree(int[] arr , int s , int e){
        if(s > e){
            return null;
        }

        int mid = s + (e - s) / 2;
        Node node = new Node(arr[mid]);

        node.left = createTree(arr , s , mid-1);
        node.right = createTree(arr , mid + 1 , e);

        return node;
    }

    public Node getRoot(){
        return this.root;
    }

}
