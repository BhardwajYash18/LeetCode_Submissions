class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] stab = new int[n];
        stab[n-1] = nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            stab[i] = Math.min(stab[i+1], nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);

            if (max <= k + stab[i])
                return i;
        }
        return -1;

    }
}