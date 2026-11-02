class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0, x = nums[n/2];
        for (int num : nums){
            ans += Math.abs(x - num);
        }
        return ans;
    }
}