package _SourceCode;

public class Sum_of_Root_To_Leaf_Binary_Numbers_1022 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    public static int sumRootToLeaf(TreeNode root, int sum){
        if(root == null){
            return 0;
        }

        sum = (2 * sum) + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }

        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        System.out.println(sumRootToLeaf(root));
    }
}
