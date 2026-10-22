class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int as = 1, ds = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == (nums[i-1] + 1) % n)
                as++;
            if (nums[i - 1] == (nums[i] + 1) % n)
                ds++;
        }

        if (as == n){
            return nums[0] == 0 ? 0 : Math.min(n - nums[0], nums[0] + 2);
        }
        if (ds == n){
            return Math.min(n - nums[n-1], nums[n-1] ) + 1;
        }
        return -1;
    }
}