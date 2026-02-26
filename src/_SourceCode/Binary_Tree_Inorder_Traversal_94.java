package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal_94 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        return inorderTraversal(root, myList);
    }

    public static List<Integer> inorderTraversal(TreeNode root, List<Integer> myList) {
        if(root == null){
            return myList;
        }
        inorderTraversal(root.left, myList);
        myList.add(root.val);
        inorderTraversal(root.right, myList);
        return myList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root));
    }
}
