package _SourceCode;

public class Convert_Sorted_Array_to_Binary_Search_Tree_108 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public static TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums, 0, nums.length - 1);
        }

        private static TreeNode helper(int[] nums, int left, int right) {
            if(left > right){
                return null;
            }

            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, left, mid - 1);
            root.right = helper(nums, mid + 1, right);
            return root;
        }


        public static void main(String[] args) {
            int nums[] = {-10, -3, 0, 5 ,9};
            System.out.println(sortedArrayToBST(nums));

        }

    }
}
