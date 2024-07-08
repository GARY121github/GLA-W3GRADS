package Trees;

import java.util.*;
public class Tree {
    private Scanner sc=new Scanner(System.in);

    private Node root;
    public Tree(){
        this.root = createTree();
    }
     private Node createTree(){
        System.out.println("enter data : ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node  root=new Node(data);
        System.out.println("enter value for left : " +data );
        root.left=createTree();
        System.out.println("enter value for right  : " +data );
        root.right=createTree();
        return root;

    }
}



