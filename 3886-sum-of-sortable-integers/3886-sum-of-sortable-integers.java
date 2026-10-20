class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int d = 1; d * d <= n; d++) {
            if (n % d != 0) continue;

            if (check(nums, d)) ans += d;

            int other = n / d;
            if (other != d && check(nums, other)) ans += other;
        }

        return ans;
    }

    private boolean check(int[] nums, int k) {
        int n = nums.length;
        int previousMax = Integer.MIN_VALUE;

        for (int start = 0; start < n; start += k) {
            int min = nums[start];
            int max = nums[start];
            int decreases = 0;

            for (int i = start; i < start + k; i++) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);

                if (i < start + k - 1 && nums[i] > nums[i + 1]) {
                    decreases++;
                }
            }

            if (nums[start + k - 1] > nums[start]) decreases++;

            if (decreases > 1 || previousMax > min) return false;

            previousMax = max;
        }

        return true;
    }
}