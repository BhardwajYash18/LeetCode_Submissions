class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            m = Math.max(m, nums[i]);
        }
        int ans = 0;
        for (int num : nums) {
            ans += (m - num);
        }
        return ans;
    }
}