class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;
        if (n == 2) return Math.max(nums[0],nums[1]);
        long sum = 0, F = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += (long) i * nums[i];
        }

        long max = F;

        for (int i = 1; i < n; i++) {
            F += sum - (long)n*nums[n-i];
            max = Math.max(max,F);
        }
        return (int)max;

    }
}