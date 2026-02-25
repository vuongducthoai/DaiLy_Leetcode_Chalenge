package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class _1382_Balance_a_Binary_Search_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution{
        public void inorderTraversal(TreeNode root, List<Integer> lst){
            if(root != null){
                inorderTraversal(root.left, lst);
                lst.add(root.val);
                inorderTraversal(root.right, lst);
            }
        }

        public TreeNode buildTree(List<Integer> lst, int low, int high){
            if(low > high){
                return null;
            }
            int mid = (low + high) / 2;
            TreeNode root = new TreeNode(lst.get(mid));
            root.left = buildTree(lst, low, mid - 1);
            root.right = buildTree(lst, mid + 1, high);
            return root;
        }

        public TreeNode balanceBST(TreeNode root){
            if(root == null){
                return null;
            }
            List<Integer> lst = new ArrayList<Integer>();
            inorderTraversal(root, lst);
            return buildTree(lst, 0, lst.size() - 1);
        }
        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.right = new TreeNode(2);
            root.right.right = new TreeNode(3);
            root.right.right.right = new TreeNode(4);
        }
    }
}
