class Solution {
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        int[] maxi = {Integer.MIN_VALUE};
        maxSum(root, maxi);
        return maxi[0];
    }

    public int maxSum(TreeNode root, int[] maxi) {
        if (root == null) return 0;
        int lSum = maxSum(root.left, maxi);
        int rSum = maxSum(root.right, maxi);
        maxi[0] = Math.max(lSum + rSum + root.val, maxi[0]);
        int val = root.val + Math.max(lSum, rSum);
        if (val < 0) return 0;
        return val;
    }
}