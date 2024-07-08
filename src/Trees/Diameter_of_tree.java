package Trees;

public class Diameter_of_tree {
    /**
     BRUTE FORCE
     **/
//    private static int diameter_of_tree(Node root){
//        if(root == null){
//            return 0;
//        }
//
//        int left_diameter = diameter_of_tree(root.left);
//        int right_diameter = diameter_of_tree(root.right);
//
//        int self_diameter = height(root.left) + height(root.right) + 2;
//
//        return Math.max(self_diameter , Math.max(left_diameter , right_diameter));
//    }
//
//    private static int height(Node root){
//        if (root == null){
//            return 0;
//        }
//
//        int left = height(root.left);
//        int right = height(root.right);
//
//        return Math.max(left , right);
//    }

    /**
     ADVANCE APPROACH
     **/
    static class Pair{
        int Max_diameter = 0;
        int height = -1;
    }

    private static Pair diameterOfTree(Node root){
        if (root == null){
            return new Pair();
        }

        Pair left = diameterOfTree(root.left);
        Pair right = diameterOfTree(root.right);

        Pair self = new Pair();
        self.Max_diameter = Math.max(Math.max(left.Max_diameter , right.Max_diameter) , left.height + right.height + 2);
        self.height = Math.max(left.height, right.height) + 1;

        return self;
    }
}