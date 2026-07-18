class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0 ; i < nums.length ; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        while (min != 0) {
            int temp = min;
            min = max%min;
            max = temp;
        }
        return max;
    }
}