class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] cnt = new int[100];
        int ans = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                cnt[nums[i]-1]++;
            }
        }
        for (int x : cnt) {
            if (x == 1)
                ans++;
        }
        return ans;
    }
}