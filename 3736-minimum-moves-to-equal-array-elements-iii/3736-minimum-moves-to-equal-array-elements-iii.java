class Solution {
    public int minMoves(int[] nums) {
        int m = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            m = Math.max(m, num);
            sum += num;
        }
        return (m * nums.length) - sum;
    }
}