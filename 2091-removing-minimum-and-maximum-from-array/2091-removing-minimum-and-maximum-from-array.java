class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[min] > nums[i]){
                min = i;
            }
            if (nums[max] < nums[i]) {
                max = i;
            }
        }

        int ans = 0;
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }

        return Math.min(Math.min(max + 1, n - min), (min + 1) + (n - max));
    }
}