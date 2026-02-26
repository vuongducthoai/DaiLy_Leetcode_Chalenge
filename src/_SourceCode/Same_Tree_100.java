package _SourceCode;

public class Same_Tree_100 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode (int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
//        p1.right = new TreeNode(3);

        TreeNode p2 = new TreeNode(1);
//        p2.left = new TreeNode(2);
        p2.right = new TreeNode(2);

        System.out.println(isSameTree(p1, p2));
    }
}
